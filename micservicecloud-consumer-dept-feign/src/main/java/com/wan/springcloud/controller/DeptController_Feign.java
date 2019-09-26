package com.wan.springcloud.controller;

import com.wan.springcloud.entities.Dept;
import com.wan.springcloud.service.DeptClientService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * feign的实现接口 测试负载均衡
 *
 * @author wan dianjie
 * @date 2019-09-26 16:08
 */
@RestController
public class DeptController_Feign

{

  @Autowired
  private DeptClientService service = null;

  @RequestMapping(value = "/consumer/dept/get/{id}")
  public Dept get(@PathVariable("id") Long id)
  {
    return this.service.get(id);
  }
  @RequestMapping(value = "/consumer/dept/list")
  public List<Dept> list()
  {
    return this.service.list();
  }
  @RequestMapping(value = "/consumer/dept/add")
  public Object add(Dept dept)
  {
    return this.service.add(dept);
  }

}