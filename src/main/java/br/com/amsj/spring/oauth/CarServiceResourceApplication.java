package br.com.amsj.spring.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.amsj.spring.oauth.mock.CarMock;
import br.com.amsj.spring.oauth.mock.ClientMock;

@SpringBootApplication
public class CarServiceResourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarServiceResourceApplication.class, args);
	}
	
	@Bean
	public CarMock carMock() {
		return new CarMock();
	}
	
	@Bean
	public ClientMock clientMock() {
		return new ClientMock();
	}

}

