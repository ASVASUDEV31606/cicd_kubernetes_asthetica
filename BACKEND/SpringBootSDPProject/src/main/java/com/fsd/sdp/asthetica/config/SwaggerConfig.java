package com.fsd.sdp.asthetica.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {
	
	@Bean
	OpenAPI artGalleryOpenAPI() {
	    return new OpenAPI()
	            .info(new Info()
	                    .title("Art Gallery API")
	                    .description("Spring Boot REST API that powers a world of creativity — manage artworks, artists, and exhibitions effortlessly.️")
	                    .version("1.0.0")
	                    .contact(new Contact()
	                            .name("Aesthetic Dev Team")
	                            .email("contact@artgallery.dev")
	                            .url("https://github.com/phanee27/GITACTIONS-SDP-DEVOPS"))
	                    .license(new License()
	                            .name("Apache 2.0")
	                            .url("http://springdoc.org")));
	}

	
}