package com.wan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author wan dianjie
 * @date 2019-09-29 14:34
 */
@SpringBootApplication
@EnableConfigServer
public class Config_3344_StartSpringCloudApp {

  public static void main(String[] args) {
    SpringApplication.run(Config_3344_StartSpringCloudApp.class,args);
  }
}
