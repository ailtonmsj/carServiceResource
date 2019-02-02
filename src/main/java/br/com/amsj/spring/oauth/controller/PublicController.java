package br.com.amsj.spring.oauth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.amsj.spring.oauth.service.CarService;
import br.com.amsj.spring.oauth.service.ClientService;

@RestController
@RequestMapping("/public")
public class PublicController {
	
	@Autowired
	CarService carService;
	
	@Autowired
	ClientService clientService;
	
    @RequestMapping("/car/amount")
    public Integer carAmount() {
        return carService.list().size();
    }
    
    @RequestMapping("/client/amount")
    public Integer clientAmount() {
        return clientService.list().size();
    }

}
