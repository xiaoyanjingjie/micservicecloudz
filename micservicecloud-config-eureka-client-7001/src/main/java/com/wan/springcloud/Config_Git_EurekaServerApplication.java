package com.wan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author wan dianjie
 * @date 2019-10-12 16:05
 */
@SpringBootApplication
@EnableEurekaServer
public class Config_Git_EurekaServerApplication {
  public static void main(String[] args)
  {
    SpringApplication.run(Config_Git_EurekaServerApplication.class, args);
  }
}
