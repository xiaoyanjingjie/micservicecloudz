package com.wan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wan dianjie
 * @date 2019-09-19 16:34
 */
@EnableEurekaClient
@SpringBootApplication
public class DeptConsumer80_App {

  public static void main(String[] args) {
    SpringApplication.run(DeptConsumer80_App.class,args);
  }
}
