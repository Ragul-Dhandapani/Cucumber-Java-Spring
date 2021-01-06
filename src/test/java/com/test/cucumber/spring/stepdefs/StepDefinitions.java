package com.test.cucumber.spring.stepdefs;

import com.test.cucumber.spring.configurations.SpringConfiguration;
import com.test.cucumber.spring.implementations.RetrieveAccountBalance;
import io.cucumber.java.en.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes={SpringConfiguration.class})
public class StepDefinitions{

    private static Logger logger=LoggerFactory.getLogger(StepDefinitions.class);

    @Autowired
    private RetrieveAccountBalance retrieveAccountBalance;

    @Value("${TransferBalance}")
    private String transferAmt;

    @Given("^Greet the user with his name \"([^\"]*)\"$")
    public void method1(String userName){
        logger.info("Welcome, Dear {}",userName);
    }

    @When("Retrieve the balance from account")
    public void retrieveTheBalanceFromAccount(){
        logger.info("Current Balance : {}",retrieveAccountBalance.getAccountBalance());
    }

    @Then("Donate the funds to user")
    public void donateTheFundsToUser(){
        logger.info("Kindly, note the {} amount as donation for trust",transferAmt);
    }
}
