package com.easylearnjava.springbootsalesforce;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RequestMethod;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@Import({springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration.class})
public class SwaggerConfig {

	@Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.basePackage("com.easylearnjava.springbootsalesforce"))              
          .paths(PathSelectors.any())                          
          .build();                                           
    }
	
    /*@Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select()
        		.apis(RequestHandlerSelectors.basePackage("com.easylearnjava.services"))
        		.paths(PathSelectors.any()).build().apiInfo(apiInfo()).useDefaultResponseMessages(false)
                .globalResponseMessage(RequestMethod.GET, newArrayList(new ResponseMessageBuilder().code(500).message("500 message").responseModel(new ModelRef("Error")).build(), new ResponseMessageBuilder().code(403).message("Forbidden!!!!!").build()));
    }

    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo("EasyLearnJava REST API's", "Creating REST based services using Spring 4", "API TOS", "Terms of service", "easylearnjava4u@gmail.com", "License of API", "API license URL");
        return apiInfo;
    }*/
}