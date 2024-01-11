package tn.iit.microservice01.proxies;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import tn.iit.microservice01.request.CreateEntraineurRequest;
import tn.iit.microservice01.response.EntraineurResponse;

@FeignClient(name = "microservice2", path = "/api/entraineur")

public interface EntraineurController {

    @PostMapping("/create")
    public EntraineurResponse createEntraineur(@RequestBody CreateEntraineurRequest createEntraineurRequest);

}
