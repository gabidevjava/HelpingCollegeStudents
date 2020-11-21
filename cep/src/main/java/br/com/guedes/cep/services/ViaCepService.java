package br.com.guedes.cep.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.guedes.cep.model.ViaCep;

@Service
public class ViaCepService {
	
	public ViaCep buscaCep() {
		RestTemplate restTemplate = new RestTemplate();
		ViaCep viaCep = restTemplate.getForObject("http://viacep.com.br", ViaCep.class);
		return viaCep;
	}	

}
