package tn.iit.proxies;

import org.springframework.context.annotation.Bean;

public class JoueurClientConfiguration {

    @Bean
    public CustumErrorDecoder myCustomErrorDecoder() {
        return new CustumErrorDecoder();
    }
}
