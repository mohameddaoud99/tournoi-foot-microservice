package tn.iit.microservice01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;
import tn.iit.microservice01.proxies.CustumErrorDecoder;


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("tn.iit.microservice01.proxies")
public class Microservice01Application {

    public static void main(String[] args) {
        SpringApplication.run(Microservice01Application.class, args);
        System.out.println("aaaaaa");
    }

    @Value("localhost:5052/api/entraineur")
    private String entraineurServiceUrl;

    @Bean
    public WebClient webClient () {
        WebClient webClient =WebClient.builder().baseUrl(entraineurServiceUrl).build();
        return webClient;
    }
    @Bean
    public CustumErrorDecoder myCustumErrorDecoder() {
        return new CustumErrorDecoder();

    }


}
