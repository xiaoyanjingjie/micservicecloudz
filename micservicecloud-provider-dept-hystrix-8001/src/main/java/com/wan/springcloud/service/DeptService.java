package com.wan.springcloud.service;

/**
 * @author wan dianjie
 * @date 2019-09-19 15:39
 */

import com.wan.springcloud.entities.Dept;
import java.util.List;


public interface DeptService

{

  public boolean add(Dept dept);

  public Dept    get(Long id);

  public List<Dept> list();

}


