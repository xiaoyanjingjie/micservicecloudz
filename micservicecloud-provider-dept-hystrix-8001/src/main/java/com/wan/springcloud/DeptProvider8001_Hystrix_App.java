package com.wan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wan dianjie
 * @date 2019-09-19 15:53
 */
@EnableCircuitBreaker //对hystrix 的熔断支持
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@SpringBootApplication
public class DeptProvider8001_Hystrix_App {

  public static void main(String[] args) {
    SpringApplication.run(DeptProvider8001_Hystrix_App.class,args);
  }
}
