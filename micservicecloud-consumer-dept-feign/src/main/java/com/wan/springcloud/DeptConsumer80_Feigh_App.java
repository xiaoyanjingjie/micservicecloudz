package com.wan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author wan dianjie
 * @date 2019-09-19 16:34
 */
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.wan.springcloud"})
@SpringBootApplication
public class DeptConsumer80_Feigh_App {

  public static void main(String[] args) {
    SpringApplication.run(DeptConsumer80_Feigh_App.class,args);
  }
}
