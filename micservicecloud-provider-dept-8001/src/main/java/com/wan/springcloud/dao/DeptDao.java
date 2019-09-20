package com.wan.springcloud.dao;


import com.wan.springcloud.entities.Dept;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author wan dianjie
 * @date 2019-09-19 15:28
 */
@Mapper
public interface DeptDao

{

   boolean addDept(@Param("dept") Dept dept);

   Dept findById(@Param("id") Long id);

   List<Dept> findAll();

}


