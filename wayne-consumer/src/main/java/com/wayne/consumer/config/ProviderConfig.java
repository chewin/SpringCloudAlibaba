package com.wayne.consumer.config;


import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * RPC服务提供者配置
 *
 */
@Component
@Data
public class ProviderConfig {

    public static final String PROVIDER_SERVICE_NAME = "wayne-provider";


}
