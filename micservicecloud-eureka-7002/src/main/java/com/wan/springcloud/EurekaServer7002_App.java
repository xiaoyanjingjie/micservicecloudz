package com.wan.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author wan dianjie
 * @date 2019-09-19 17:16
 */
@EnableEurekaServer //服务器端启动类,接受其它微服务注册进来
@SpringBootApplication
public class EurekaServer7002_App {

  public static void main(String[] args) {
    SpringApplication.run(EurekaServer7002_App.class,args);
  }
}
