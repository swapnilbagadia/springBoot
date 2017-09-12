package com.fkart.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EntityScan("com.fkart.api.models")
@EnableJpaRepositories("com.fkart.api.repository")
@EnableSwagger2
@EnableAutoConfiguration
@ComponentScan("com.fkart.api")
public class DemoApplication {

    private static Logger logger = LoggerFactory.getLogger(DemoApplication.class);

    private boolean isSwaggerEnabled = true;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        logger.info("Test");
    }

    @Bean
    public Docket swaggerSettings() {
        return new Docket(DocumentationType.SWAGGER_2)
                .enable(isSwaggerEnabled)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.fkart.api"))
                .paths(PathSelectors.any())
                .build();
    }
}
