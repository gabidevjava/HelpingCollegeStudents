package br.com.guedes.cep.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.guedes.cep.model.Cep;
import br.com.guedes.cep.services.CepService;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/ceps")
public class CepResource {

	@Autowired
	CepService cepService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Cep>> findAll() {
		List<Cep> list = cepService.findAll();
		return ResponseEntity.ok().body(list);
	}

	@RequestMapping(value = "/{cep}", method = RequestMethod.GET)
	public ResponseEntity<Cep> findById(@PathVariable String cep) {
		Cep obj = cepService.findByCep(cep);
		return ResponseEntity.ok().body(obj);
	}

}
