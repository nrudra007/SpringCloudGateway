package com.aws.projects.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ApiGatewayApplication {
	
//	@Bean
//	public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
//		return builder.routes()
//				.route(route -> route
//						.path("/company-service/**")
//						.uri("http://localhost:8000"))
//				.route(route -> route
//						.path("/employee-service/**")
//						//.filters(f -> f.circuitBreaker(config -> config.setName("mycmd")))
//						.uri("http://localhost:8100")).
//				build();
//	}
	
	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}
}
