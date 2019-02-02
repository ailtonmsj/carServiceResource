package br.com.amsj.spring.oauth.mock;

import java.util.ArrayList;
import java.util.List;

import br.com.amsj.spring.oauth.enums.Gender;
import br.com.amsj.spring.oauth.enums.Status;
import br.com.amsj.spring.oauth.model.Car;
import br.com.amsj.spring.oauth.model.Client;

public class ClientMock {
	
	public List<Client> clients;
	
	public ClientMock() {
		
		System.out.println("--> Init ClientMock");
		
		clients = new ArrayList<>();
		
		clients.add(new Client(1L, "Alf", "Smith", Gender.MALE, Status.ACTIVE, new Car(5L, "Punto", "Fiat", "GT")));
		clients.add(new Client(2L, "Bruce", "Wayne", Gender.MALE, Status.ACTIVE, new Car(6L, "Huracán", "Lamborghini", "SVJ Coupé")));
	}

}
