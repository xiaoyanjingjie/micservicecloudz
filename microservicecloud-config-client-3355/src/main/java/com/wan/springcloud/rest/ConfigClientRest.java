package com.wan.springcloud.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientRest
{

	@Value("${spring.application.name}")
	private String applicationName;

	@Value("${eureka.client.service-url.defaultzone}")
	private String eurekaServers;

	@Value("${server.port}")
	private String port;

	@RequestMapping("/config")
	public String getConfig()
	{
		String str = "applicationName: " + applicationName + "eurekaServers:" + eurekaServers + "port: " + port;
		System.out.println("******str: " + str);
		return "applicationName: " + applicationName + "eurekaServers:" + eurekaServers + "port: " + port;
	}
}
