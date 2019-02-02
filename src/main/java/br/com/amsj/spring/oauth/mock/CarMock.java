package br.com.amsj.spring.oauth.mock;

import java.util.ArrayList;
import java.util.List;

import br.com.amsj.spring.oauth.model.Car;

public class CarMock {
	
	public List<Car> cars = null;
	
	public CarMock() {
		
		System.out.println("--> Init CarMock");
		
		cars = new ArrayList<>();
		
		cars.add(new Car(1L, "Argo", "Fiat", "XL"));		
		cars.add(new Car(2L, "Tiguan", "Volkswagem", "Sport"));
		cars.add(new Car(3L, "Corolla", "Toyota", "XLS"));
		cars.add(new Car(4L, "Uno", "Fiat", "Sport"));
	}
}
