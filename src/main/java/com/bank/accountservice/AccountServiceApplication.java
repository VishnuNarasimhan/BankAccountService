package com.bank.accountservice;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.models.annotations.OpenAPI30;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.bank.accountservice.controller") })
@EnableJpaRepositories("com.bank.accountservice.repository")
@EntityScan("com.bank.accountservice.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
// Enable the JPA Auditing and please leverage the bean with the name auditAwareImpl
// to understand the current auditor.
@OpenAPIDefinition(
        info = @Info(
                title = "Account microservice REST API documentation",
                description = "Bank Account microservice REST API documentation",
                version = "v1",
                contact = @Contact(
                        name = "Vishnu Narasimhan",
                        email = "vishnunaraim20@gmail.com"
                ),
                license = @License(
                        name = "Apache 2.0"
                )
        )
)
public class AccountServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountServiceApplication.class, args);
        System.out.println("APPLICATION STARTED");
    }

}
