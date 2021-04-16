package com.wayne.consumer.service.fallback;

import com.wayne.consumer.service.EchoService;
import org.springframework.stereotype.Component;


@Component
public class EchoServiceFallback implements EchoService {

	@Override
	public String echo(String message) {
		return "echo fallback";
	}
}
