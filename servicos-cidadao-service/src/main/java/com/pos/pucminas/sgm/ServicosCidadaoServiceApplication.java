package com.pos.pucminas.sgm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableCircuitBreaker
@EnableDiscoveryClient
@SpringBootApplication
public class ServicosCidadaoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicosCidadaoServiceApplication.class, args);
	}

}
