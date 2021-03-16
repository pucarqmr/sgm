package com.pos.pucminas.sgm.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Iptu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String inscricaoImobiliaria;
	private String inscricaoFiscal;
	private String subLote;
	private Double totalExercio;
	private Long exercicio;
	private Double valorVenal;
	private Double valorImposto;
	private Double taxaColetaLixo;
	private String logradouro;
	private String prorietario;
	private String cpfCnpjProprietario;
	
	public Iptu() {
		
	}
	

	public Iptu(String inscricaoImobiliaria, String inscricaoFiscal, String subLote, Double totalExercio,
			Long exercicio, Double valorVenal, Double valorImposto, Double taxaColetaLixo, String logradouro,
			String prorietario, String cpfCnpjProprietario) {
		super();
		this.inscricaoImobiliaria = inscricaoImobiliaria;
		this.inscricaoFiscal = inscricaoFiscal;
		this.subLote = subLote;
		this.totalExercio = totalExercio;
		this.exercicio = exercicio;
		this.valorVenal = valorVenal;
		this.valorImposto = valorImposto;
		this.taxaColetaLixo = taxaColetaLixo;
		this.logradouro = logradouro;
		this.prorietario = prorietario;
		this.cpfCnpjProprietario = cpfCnpjProprietario;
	}

	public String getCpfCnpjProprietario() {
		return cpfCnpjProprietario;
	}

	public void setCpfCnpjProprietario(String cpfCnpjProprietario) {
		this.cpfCnpjProprietario = cpfCnpjProprietario;
	}

	public String getInscricaoImobiliaria() {
		return inscricaoImobiliaria;
	}

	public void setInscricaoImobiliaria(String inscricaoImobiliaria) {
		this.inscricaoImobiliaria = inscricaoImobiliaria;
	}

	public String getInscricaoFiscal() {
		return inscricaoFiscal;
	}

	public void setInscricaoFiscal(String inscricaoFiscal) {
		this.inscricaoFiscal = inscricaoFiscal;
	}

	public String getSubLote() {
		return subLote;
	}

	public void setSubLote(String subLote) {
		this.subLote = subLote;
	}

	public Double getTotalExercio() {
		return totalExercio;
	}

	public void setTotalExercio(Double totalExercio) {
		this.totalExercio = totalExercio;
	}

	public Long getExercicio() {
		return exercicio;
	}

	public void setExercicio(Long exercicio) {
		this.exercicio = exercicio;
	}

	public Double getValorVenal() {
		return valorVenal;
	}

	public void setValorVenal(Double valorVenal) {
		this.valorVenal = valorVenal;
	}

	public Double getValorImposto() {
		return valorImposto;
	}

	public void setValorImposto(Double valorImposto) {
		this.valorImposto = valorImposto;
	}

	public Double getTaxaColetaLixo() {
		return taxaColetaLixo;
	}

	public void setTaxaColetaLixo(Double taxaColetaLixo) {
		this.taxaColetaLixo = taxaColetaLixo;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getProrietario() {
		return prorietario;
	}

	public void setProrietario(String prorietario) {
		this.prorietario = prorietario;
	}

}
