package tn.iit;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

import tn.iit.proxies.CustumErrorDecoder;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("tn.iit.proxies")
public class Microservice3Application {

	public static void main(String[] args) {
		SpringApplication.run(Microservice3Application.class, args);
	}

	
	@Value("localhost:5051/api/joueurs")
	private String joueurServiceUrl;
	
	@Bean
	public WebClient webClient () {
	WebClient webClient =WebClient.builder().baseUrl(joueurServiceUrl).build();
	return webClient;
	}
	@Bean
	public CustumErrorDecoder myCustumErrorDecoder() {
		return new CustumErrorDecoder();
				
	}

}

