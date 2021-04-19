package com.wayne.consumer.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties(prefix = "inter")
@Data
public class ConfigureConfig {
    private String name;
    private String url;

}
