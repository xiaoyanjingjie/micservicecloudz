package com.wan.springcloud.service;

import com.wan.springcloud.entities.Dept;
import java.util.List;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * feign 负载均衡
 *
 * @author wan dianjie
 * @date 2019-09-26 16:06
 */
@FeignClient(value = "MICSERVICECLOUD-DEPT",fallbackFactory=DeptClientServiceFallbackFactory.class)
public interface DeptClientService

{

  @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
  public Dept get(@PathVariable("id") long id);

  @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
  public List<Dept> list();

  @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
  public boolean add(Dept dept);

}