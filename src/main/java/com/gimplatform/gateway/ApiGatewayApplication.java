package com.gimplatform.gateway;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

/**
 * 支持oauth2的网关
 * @author zzd
 *
 */
@SpringBootApplication
@EnableZuulProxy
@EnableOAuth2Client
public class ApiGatewayApplication {

	public static void main(String[] args) {
    	SpringApplication app = new SpringApplication(ApiGatewayApplication.class);
    	app.setBannerMode(Banner.Mode.OFF);
    	app.run(args); 
	}
}
