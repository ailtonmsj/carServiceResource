package br.com.amsj.spring.oauth.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.amsj.spring.oauth.service.CarService;
import br.com.amsj.spring.oauth.service.ClientService;

@RestController
@RequestMapping("/public")
public class PublicController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CarService carService;
	
	@Autowired
	ClientService clientService;
	
    @RequestMapping("/car/amount")
    public Integer carAmount() {
    	
    	logger.info("in carAmount method");
    	
        return carService.list().size();
    }
    
    @RequestMapping("/client/amount")
    public Integer clientAmount() {
    	
    	logger.info("in clientAmount method");
    	
        return clientService.list().size();
    }

}
