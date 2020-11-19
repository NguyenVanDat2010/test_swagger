package com.example.demoswagger.config;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig{// extends WebMvcConfigurationSupport {
//    @Bean
//    public Docket createRestApi(){
//        // @formatter:off
//        //Register the controllers to swagger
//        //Also it is configuring the Swagger Docket
//        return new Docket(DocumentationType.SWAGGER_2).select()
////                .apis(RequestHandlerSelectors.any())
//                .apis(Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.boot")))
////                .paths(PathSelectors.any())
////                .paths(PathSelectors.ant("/swagger2-demo"))
//                .build();
//    }
//
//    @Override
//    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
//        //enabling swagger-ui part for visual documentation
//        registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
//        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
//    }

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.demoswagger.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Demo swagger")
                .description("API for demo swagger")
                .version("1.0")
                .build();
    }
}
