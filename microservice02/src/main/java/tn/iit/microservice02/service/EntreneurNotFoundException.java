package tn.iit.microservice02.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(HttpStatus.BAD_REQUEST)
public class  EntreneurNotFoundException extends RuntimeException {
	public  EntreneurNotFoundException(String message) {
		super(message);
	}
}
