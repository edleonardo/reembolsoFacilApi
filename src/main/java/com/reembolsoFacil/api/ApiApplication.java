package com.reembolsoFacil.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.reembolsoFacil.api.config.BasicConfiguration;

import controller.BankController;
import controller.DepartamentApproverController;
import controller.DepartamentController;
import controller.RefundController;
import controller.TypeRefundController;
import controller.UserController;
import services.BankService;
import services.DepartamentApproverService;
import services.DepartamentService;
import services.RefundServices;
import services.TypeRefundService;
import services.UserServices;


@SpringBootApplication(scanBasePackageClasses = {ApiApplication.class})
@EnableJpaRepositories(basePackages = 
     {"repository",
     })
@EntityScan("datasource.model")
@ComponentScan(basePackageClasses = {TypeRefundController.class, DepartamentApproverController.class, BankController.class, DepartamentController.class, RefundController.class , UserController.class ,DepartamentApproverService.class, RefundServices.class ,BankService.class, DepartamentService.class,TypeRefundService.class, BasicConfiguration.class, UserServices.class})

public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

}
