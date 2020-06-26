package com.reembolsoFacil.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.reembolsoFacil.api.config.BasicConfiguration;

import controller.RefundController;
import controller.UserController;
import services.RefundServices;
import services.UserServices;


@SpringBootApplication(scanBasePackageClasses = {ApiApplication.class})
@EnableJpaRepositories(basePackages = 
     {"repository",
     })
@EntityScan("datasource.model")
@ComponentScan(basePackageClasses = {RefundController.class , UserController.class , RefundServices.class ,BasicConfiguration.class, UserServices.class})

public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

}
