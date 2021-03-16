package com.pos.pucminas.sgm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pos.pucminas.sgm.domain.Iptu;
import com.pos.pucminas.sgm.repository.IptuRepository;

@Service
public class IptuService {
	
	@Autowired
	private IptuRepository iptuRepository;

	public List<Iptu> listar() {
		return iptuRepository.findAll();
	}

	public Iptu findByInscricaoImobiliaria(String inscricaoImobiliaria) {
		return iptuRepository.findByInscricaoImobiliaria(inscricaoImobiliaria);
	}

}
