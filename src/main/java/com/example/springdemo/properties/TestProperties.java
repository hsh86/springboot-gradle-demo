package com.example.springdemo.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties(prefix = "test")
@Component
public class TestProperties {
    private boolean aaa = true;
    private String bbb;
}
