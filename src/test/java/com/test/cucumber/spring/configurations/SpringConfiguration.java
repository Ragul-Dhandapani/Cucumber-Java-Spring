package com.test.cucumber.spring.configurations;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.test")
@PropertySources({
        @PropertySource("classpath:application.properties"),
        @PropertySource("classpath:test.properties")
})
public class SpringConfiguration{
    //PropertySources -> Is used to load the multiple Properties file at a time
    // (Make sure you should always use unique property key value across all the properties)
}
