package tn.iit.microservice01.proxies;

import feign.Response;
import feign.codec.ErrorDecoder;

public class CustumErrorDecoder implements ErrorDecoder{

    private final ErrorDecoder defaultErrorDecoder = new ErrorDecoder.Default();

    @Override
    public Exception decode(String invoqueur, Response reponse) {
        if (reponse.status() == 400) {
            throw new AdressNotFoundException("Requête incorrecte ");
        }
        return defaultErrorDecoder.decode(invoqueur, reponse);
    }
}
