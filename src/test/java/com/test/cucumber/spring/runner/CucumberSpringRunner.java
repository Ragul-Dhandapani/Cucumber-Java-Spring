package com.test.cucumber.spring.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/",
        glue="com.test.cucumber.spring")
public class CucumberSpringRunner{
}
