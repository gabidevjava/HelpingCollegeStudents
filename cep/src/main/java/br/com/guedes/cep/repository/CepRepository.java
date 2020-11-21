package br.com.guedes.cep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.guedes.cep.model.Cep;

@Repository
public interface CepRepository extends JpaRepository<Cep, Long> {
	
	Cep findByCep(String cep);

}
