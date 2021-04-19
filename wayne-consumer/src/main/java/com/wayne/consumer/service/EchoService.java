package com.wayne.consumer.service;


import com.wayne.consumer.config.ProviderConfig;
import com.wayne.consumer.service.fallback.EchoServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// 通过 @FeignClient("服务名") 注解来指定调用哪个服务
@FeignClient(fallback = EchoServiceFallback.class, value = ProviderConfig.PROVIDER_SERVICE_NAME)
public interface EchoService {
    @GetMapping(value = "/echo/{message}")
    String echo(@PathVariable("message") String message);

}