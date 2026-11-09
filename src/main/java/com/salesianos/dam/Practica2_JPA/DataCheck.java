package com.salesianos.dam.Practica2_JPA;


import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;

@Component
@DependsOn("DataSeed")
public class DataCheck {

    private final TransactionTemplate transactionTemplate;

    public DataCheck(PlatformTransactionManager transactionManager) {
        this.transactionTemplate = new TransactionTemplate(transactionManager);

    }



}
