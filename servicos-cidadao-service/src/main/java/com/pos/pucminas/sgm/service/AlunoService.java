package com.pos.pucminas.sgm.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pos.pucminas.sgm.domain.Aluno;
import com.pos.pucminas.sgm.domain.Endereco;
import com.pos.pucminas.sgm.domain.Escola;
import com.pos.pucminas.sgm.exception.CustomException;
import com.pos.pucminas.sgm.repository.AlunoRepository;
import com.pos.pucminas.sgm.repository.EnderecoRepository;
import com.pos.pucminas.sgm.repository.EscolaRepository;

@Service
public class AlunoService {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Autowired
	private EscolaRepository escolaRepository;
	
	public List<Aluno> listarTodos() {
		List<Aluno> alunos = new ArrayList<>();
		alunoRepository.findAll().forEach(alunos::add);
		return alunos;
	}
	
	public Aluno salvarNovoAluno(Aluno aluno) {
		Aluno alunoExistente = alunoRepository.findByCpf(aluno.getCpf());
		
		if (alunoExistente != null) {
			throw new CustomException("Já existe um aluno com o CPF: " + aluno.getCpf());
		}
		
		return salvar(aluno);
	}
	
	public Aluno salvar(Aluno aluno) {
		Endereco enderecoExistente = null;
		if (aluno.getEndereco() != null) {
			enderecoExistente = enderecoRepository.findByLogradouroAndNumero(aluno.getEndereco().getLogradouro(), aluno.getEndereco().getNumero());
		}
		aluno.setEndereco(enderecoExistente);
		
		if (aluno.getEscola() != null) {
			Optional<Escola> escolaOptional = escolaRepository.findById(aluno.getEscola().getId());
			if (escolaOptional.isPresent()) {
				aluno.setEscola(escolaOptional.get());
			}
			
		}
		
		return alunoRepository.save(aluno);		
	}
	
	
	

	public Optional<Aluno> findById(Long alunoId) {
		return alunoRepository.findById(alunoId);
	}

	public void excluir(Long alunoId) {
		alunoRepository.deleteById(alunoId);
	}
	
	

}
