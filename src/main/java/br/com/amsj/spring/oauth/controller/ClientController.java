package br.com.amsj.spring.oauth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.amsj.spring.oauth.model.Client;
import br.com.amsj.spring.oauth.service.ClientService;

@RestController
@RequestMapping("/client")
public class ClientController {
	
	@Autowired
	ClientService clientService;
	
	@RequestMapping(path="/list", method=RequestMethod.GET)
	public List<Client> list(){
		return clientService.list();
	}

}
