package com.pos.pucminas.sgm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pos.pucminas.sgm.domain.Escola;

@Repository
public interface EscolaRepository extends JpaRepository<Escola, Long> {
	

}
