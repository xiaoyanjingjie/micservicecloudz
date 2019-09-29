package com.wan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author wan dianjie
 * @date 2019-09-27 10:17
 */
@SpringBootApplication
@EnableZuulProxy
public class Zuul_9527_StartSpringCloudApp {
  public static void main(String[] args)

  {

    SpringApplication.run(Zuul_9527_StartSpringCloudApp.class, args);

  }
}
