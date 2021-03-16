package com.pos.pucminas.sgm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pos.pucminas.sgm.domain.Iptu;

public interface IptuRepository extends JpaRepository<Iptu, Long>{
	
	Iptu findByInscricaoImobiliaria(String inscricaoImobiliaria);

}
