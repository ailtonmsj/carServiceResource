package br.com.amsj.spring.oauth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.amsj.spring.oauth.model.Car;
import br.com.amsj.spring.oauth.service.CarService;

@RestController
@RequestMapping("/car")
public class CarController {
	
	@Autowired
	CarService carService;
	
	@RequestMapping(path="/list", method=RequestMethod.GET)
	public List<Car> list() {
		return carService.list();
	}

}
