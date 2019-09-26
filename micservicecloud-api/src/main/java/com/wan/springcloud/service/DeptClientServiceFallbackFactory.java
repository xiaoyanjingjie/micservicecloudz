package com.wan.springcloud.service;

import com.wan.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * 服务降级
 *
 * @author wan dianjie
 * @date 2019-09-26 17:23
 */

@Component//不要忘记添加，不要忘记添加
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService>
{
  @Override
  public DeptClientService create(Throwable throwable)
  {
    return new DeptClientService() {
      @Override
      public Dept get(long id)
      {
        return new Dept().setDeptno(id)
            .setDname("该ID："+id+"没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭")
            .setDb_source("no this database in MySQL");
      }

      @Override
      public List<Dept> list()
      {
        return null;
      }

      @Override
      public boolean add(Dept dept)
      {
        return false;
      }
    };
  }

}