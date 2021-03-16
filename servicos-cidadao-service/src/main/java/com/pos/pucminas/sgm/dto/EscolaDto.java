package com.pos.pucminas.sgm.dto;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class EscolaDto {
	
	private Long id;
	
	@NotBlank
	@Size(max = 250)
	private String nome;
	
	private String tipo;
	
	private EnderecoDto endereco;
	
	private List<AlunoDto> alunos;

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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public EnderecoDto getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoDto endereco) {
		this.endereco = endereco;
	}

	public List<AlunoDto> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<AlunoDto> alunos) {
		this.alunos = alunos;
	}
	
	
	

}
