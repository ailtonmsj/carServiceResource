package br.com.amsj.spring.oauth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.amsj.spring.oauth.mock.ClientMock;
import br.com.amsj.spring.oauth.model.Client;

@Service
public class ClientService {
	
	@Autowired
	ClientMock clientMock;
	
	public List<Client> list(){
		return clientMock.clients;
	}
}
