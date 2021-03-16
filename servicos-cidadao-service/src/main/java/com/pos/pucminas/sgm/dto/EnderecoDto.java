package com.pos.pucminas.sgm.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class EnderecoDto {
	
	private Long id;
	
	@NotBlank
	@Size(max = 250)
	private String logradouro;
	
	@NotBlank
	private Integer numero;
	
	@NotBlank
	private String bairro;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

}
