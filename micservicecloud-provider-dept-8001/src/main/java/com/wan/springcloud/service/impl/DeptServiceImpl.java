package com.wan.springcloud.service.impl;

/**
 * @author wan dianjie
 * @date 2019-09-19 15:40
 */

import com.wan.springcloud.dao.DeptDao;
import com.wan.springcloud.entities.Dept;
import com.wan.springcloud.service.DeptService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


@Service

public class DeptServiceImpl implements DeptService

{

  @Autowired

  private DeptDao dao ;



  @Override

  public boolean add(Dept dept)

  {

    return dao.addDept(dept);

  }

  @Override

  public Dept get(Long id)

  {

    return dao.findById(id);

  }

  @Override

  public List<Dept> list()

  {

    return dao.findAll();

  }

}

