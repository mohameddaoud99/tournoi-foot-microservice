package tn.iit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.iit.request.CreateCartonRequest;
import tn.iit.response.CartonResponse;
import tn.iit.service.CartonService;

@RestController
@RequestMapping("/api/carton")
public class CartonController {
	
	@Autowired
	CartonService cartonService;
	
	@PostMapping("/create")
	public CartonResponse createCarton (@RequestBody CreateCartonRequest createCartonRequest) {
		return cartonService.createCarton(createCartonRequest);
	}
	
	@GetMapping("/getById/{id}")
	public CartonResponse getById (@PathVariable long id) {
		return cartonService.getById(id);
	}
	
}
