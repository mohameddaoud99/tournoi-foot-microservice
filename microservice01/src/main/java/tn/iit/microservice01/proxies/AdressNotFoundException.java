package tn.iit.microservice01.proxies;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class AdressNotFoundException extends RuntimeException {

    public AdressNotFoundException(String message) {
        super(message);
    }
}
