package com.wan.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author wan dianjie
 * @date 2019-09-19 16:31
 */
@Configuration
public class ConfigBean {
  @LoadBalanced
  @Bean
  public RestTemplate getRestTemplate()

  {
    return new RestTemplate();
  }
}
