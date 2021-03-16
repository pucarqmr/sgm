package com.pos.pucminas.sgm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pos.pucminas.sgm.domain.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long>{
	
	@Query("FROM Endereco where logradouro = :logradouro and numero = :numero") 
	Endereco findByLogradouroAndNumero(@Param("logradouro") String logradouro, @Param("numero") Integer numero); 

}
