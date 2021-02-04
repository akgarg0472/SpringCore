package com.springcore.noXMLConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.noXMLConfiguration")
public class Config {

    @Bean("programming")
    public Programming getProgramming() {
        return new Programming();
    }
}
