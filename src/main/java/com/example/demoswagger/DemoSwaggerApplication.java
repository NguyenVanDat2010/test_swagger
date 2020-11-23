package com.example.demoswagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.jmx.support.RegistrationPolicy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//@EnableMBeanExport(registration = RegistrationPolicy.IGNORE_EXISTING)
//@EnableTransactionManagement
public class DemoSwaggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSwaggerApplication.class, args);
    }

}
