package com.wayne.consumer.controller;

import com.wayne.consumer.service.EchoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
	private final EchoService echoService;

	public ConsumerController(EchoService echoService) {
		this.echoService = echoService;
	}

	@GetMapping(value = "/echo/hi")
	public String echo ( ) {
		return echoService.echo("Hi Feign");
	}

}
