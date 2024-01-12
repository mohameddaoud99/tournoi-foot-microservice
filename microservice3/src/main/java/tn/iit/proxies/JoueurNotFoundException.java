package tn.iit.proxies;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class JoueurNotFoundException extends RuntimeException {
	public JoueurNotFoundException(String message) {
		super(message);
	}
}
