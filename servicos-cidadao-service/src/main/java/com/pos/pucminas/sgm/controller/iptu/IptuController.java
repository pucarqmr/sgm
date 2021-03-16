package com.pos.pucminas.sgm.controller.iptu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pos.pucminas.sgm.domain.Iptu;
import com.pos.pucminas.sgm.service.IptuService;

@RestController
@RequestMapping("/iptus")
public class IptuController {
	
	@Autowired
	private ServerProperties serverProperties;
	
	@Autowired
	private IptuService iptuService;
	
//	@HystrixCommand(fallbackMethod = "fallbackSegundaVia", commandProperties = {
//            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "5"),
//            @HystrixProperty(name = "metrics.rollingStats.timeInMilliseconds", value = "10000") })
	@GetMapping("segundavia/{inscricaoImobiliaria}")
	public ResponseEntity<Iptu> segundaVida(@PathVariable("inscricaoImobiliaria") String inscricaoImobiliaria) {
		System.out.println("IptuController running from port: "  + serverProperties.getPort());
		Iptu iptu = iptuService.findByInscricaoImobiliaria(inscricaoImobiliaria);
		
		if (iptu == null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(iptu);
	}
	
	@GetMapping
	public List<Iptu> listar() {
		return iptuService.listar();
	}
	
}
