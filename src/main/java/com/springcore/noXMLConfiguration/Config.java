package com.springcore.noXMLConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// no need of @ComponentScan() if we are using @Bean annotation for all POJO classes
//@ComponentScan(basePackages = "com.springcore.noXMLConfiguration")
public class Config {

    @Bean("programming")
    public Programming getProgramming() {
        return new Programming();
    }
}
