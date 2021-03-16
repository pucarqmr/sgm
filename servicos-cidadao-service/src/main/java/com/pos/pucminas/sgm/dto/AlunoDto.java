package com.pos.pucminas.sgm.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class AlunoDto {

	private Long id;

	@NotBlank
	@Size(min = 3, max = 250)
	private String nome;

	@NotBlank
	private String cpf;

	private String nomePai;
	private String nomeMae;

	@Valid
	@JsonIgnore
	private EscolaDto escola;

	@Valid
	private EnderecoDto endereco;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public EscolaDto getEscola() {
		return escola;
	}

	public void setEscola(EscolaDto escola) {
		this.escola = escola;
	}

	public EnderecoDto getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoDto endereco) {
		this.endereco = endereco;
	}

}
