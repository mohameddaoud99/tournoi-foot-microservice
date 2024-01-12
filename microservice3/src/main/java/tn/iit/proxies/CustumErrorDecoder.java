package tn.iit.proxies;

import feign.Response;
import feign.codec.ErrorDecoder;

public class CustumErrorDecoder implements ErrorDecoder {

	private final ErrorDecoder defaultErrorDecoder = new Default();

	@Override
	public Exception decode(String invoqueur, Response reponse) {
		if (reponse.status() == 400) {
			throw new JoueurNotFoundException("Requête incorrecte ");
		}
		return defaultErrorDecoder.decode(invoqueur, reponse);
	}

}
