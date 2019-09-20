package com.wan.springcloud.controller;

import com.wan.springcloud.entities.Dept;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author wan dianjie
 * @date 2019-09-19 16:32
 */
@RestController
public class DeptController_Consumer {

  private static final String REST_URL_PREFIX = "http://localhost:8001";


  @Autowired
  private RestTemplate restTemplate;


  @RequestMapping(value = "/consumer/dept/add")
  public boolean add(Dept dept) {

    return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);

  }


  @RequestMapping(value = "/consumer/dept/get/{id}")
  public Dept get(@PathVariable("id") Long id) {
    return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);

  }


  @SuppressWarnings("unchecked")
  @RequestMapping(value = "/consumer/dept/list")
  public List<Dept> list() {
    return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);

  }
}
