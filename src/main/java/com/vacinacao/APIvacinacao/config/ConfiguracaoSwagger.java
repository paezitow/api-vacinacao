package com.vacinacao.APIvacinacao.config;

import static springfox.documentation.builders.PathSelectors.regex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class ConfiguracaoSwagger {
	@Bean
	public Docket vacinaApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.vacinacao.APIvacinacao"))
				.paths(regex("/api.*"))
				.build()
				.apiInfo(metaInfo());
	}
	
	private ApiInfo metaInfo() {
		
		ApiInfo apiInfo = new ApiInfo(
				"API REST de Vacinação",
				"API de cadastro de vacinados",
				"1.0",
				"Terms of Service",
				new Contact("Hugo Porfirio","https://www.linkedin.com/in/hugo-porfirio-738649184/","hugoporfirio16@gmail.com"),
				"Apache License Version 2.0",
				"https://www.apache.org/licesen.html",
				new ArrayList<VendorExtension>()
				);
		
		return apiInfo;
	}

}
