package com.wan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author wan dianjie
 * @date 2019-09-26 18:36
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumer_DashBoard_App
{
  public static void main(String[] args)
  {
    SpringApplication.run(DeptConsumer_DashBoard_App.class,args);
  }
}

