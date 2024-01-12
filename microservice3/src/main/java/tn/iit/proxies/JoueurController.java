package tn.iit.proxies;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import tn.iit.request.CreateJoueurRequest;
import tn.iit.response.JoueurResponse;

@FeignClient(name = "microservice1", path = "/api/joueurs",configuration = JoueurClientConfiguration.class)

public interface JoueurController {

	@PostMapping("/create")
	public JoueurResponse createCarton(@RequestBody CreateJoueurRequest createCartonRequest);

	@GetMapping("/getById/{id}")
	public JoueurResponse getById(@PathVariable long id);

}

