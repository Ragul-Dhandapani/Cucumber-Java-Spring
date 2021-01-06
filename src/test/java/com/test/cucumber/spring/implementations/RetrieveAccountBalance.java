package com.test.cucumber.spring.implementations;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RetrieveAccountBalance{

    private static Logger logger=LoggerFactory.getLogger(RetrieveAccountBalance.class);

    @Value("${AccountBalance}")
    private String accountBalance;

    public String getAccountBalance(){
        logger.info("===== Retrieving the funds from account =====");
        return accountBalance;
    }
}
