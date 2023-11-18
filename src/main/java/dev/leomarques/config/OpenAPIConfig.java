package dev.leomarques.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenAPIConfig {
	
	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI().info(new Info().title("Meu API").version("V1").description("Descrição da API").termsOfService("TErmos de serviço").license(new License()));
	}

}

