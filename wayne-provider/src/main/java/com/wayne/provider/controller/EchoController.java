package com.wayne.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/echo")
public class EchoController {
	@Value("${server.port}")
	private String port;

	private final ConfigurableApplicationContext configurableApplicationContext;

	public EchoController(ConfigurableApplicationContext configurableApplicationContext) {
		this.configurableApplicationContext = configurableApplicationContext;
	}

	@GetMapping(value = "/{message}")
	public String echo (@PathVariable String message) {
		return "Hello Nacos Discovery " + message + " I am from port " + port + "-" + configurableApplicationContext.getEnvironment().getProperty("user.name");
	}

}
