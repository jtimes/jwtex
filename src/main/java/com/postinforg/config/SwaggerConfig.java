package com.postinforg.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {
	private final String TITLE = "title";
    private final String DESCRIPTION = "description";
    private final String VERSION = "V1.0.0";
    
	@Bean
    public OpenAPI api() {
////        return new Docket(DocumentationType.SWAGGER_2)
////                .select()
////                .apis(RequestHandlerSelectors.any())
////                .paths(PathSelectors.any())
////                .build();
//		
//		
		OpenAPI api = new OpenAPI() 
				.info(new Info()
                .title(TITLE)
                .description(DESCRIPTION)
                .version(VERSION)
                );
		return api;
    }
	

//	@Bean
//	public OperationCustomizer customize() {
//		Parameter parametersItem = new Parameter()
////				.in(ParameterIn.HEADER.toString())
//				.in("header")
//				.schema(new StringSchema()._default("1234567890"))
//				.name("accessToken")
//				.description("valid token from auth api")
//				.required(false);
//		
//		return (operation, handlerMethod) -> operation.addParametersItem(parametersItem);
//	}
}
