package br.com.amsj.spring.oauth.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.amsj.spring.oauth.mock.CarMock;
import br.com.amsj.spring.oauth.model.Car;

@Service
public class CarService {
	
	@Autowired
	CarMock carMock;
	
	public List<Car> list(){
		return this.carMock.cars;
	}
	
	public Optional<Car> get(Long id) {
		return this.carMock.cars.stream().filter(c -> c.getId().equals(id)).findAny(); 
	}

}
