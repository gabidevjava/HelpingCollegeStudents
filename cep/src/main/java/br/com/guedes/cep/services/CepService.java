package br.com.guedes.cep.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.guedes.cep.model.Cep;
import br.com.guedes.cep.repository.CepRepository;

@Service
public class CepService {
	
	@Autowired
	CepRepository cepRepository;

	public List<Cep> findAll() {
		return (List<Cep>) cepRepository.findAll();
	}

	public Cep findByCep(String cep) {
		return cepRepository.findByCep(cep);
	}

}
