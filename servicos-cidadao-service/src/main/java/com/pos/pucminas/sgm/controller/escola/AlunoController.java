package com.pos.pucminas.sgm.controller.escola;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.pos.pucminas.sgm.domain.Aluno;
import com.pos.pucminas.sgm.service.AlunoService;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
	
	Logger logger = LoggerFactory.getLogger(AlunoController.class);
	
	@Autowired
	private AlunoService alunoService; 
	
	@GetMapping
	private List<Aluno> listar() {
		return alunoService.listarTodos();
	}
	
	@GetMapping("/{alunoId}")
	public ResponseEntity<Aluno> buscar(@PathVariable Long alunoId) {
		logger.info("Searching aluno with id: " + alunoId);
		Optional<Aluno> aluno = alunoService.findById(alunoId);
		
		if (aluno.isPresent()) {
			return ResponseEntity.ok(aluno.get());
		}
		
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	public Aluno adicionar(@Valid @RequestBody Aluno aluno) {
		return alunoService.salvarNovoAluno(aluno);
	}
	
	@PutMapping("/{alunoId}")
	public ResponseEntity<Aluno> atualizar(@Valid @PathVariable Long alunoId,
			@RequestBody Aluno aluno) {
		Optional<Aluno> alunoOptional = alunoService.findById(alunoId);
		
		if (!alunoOptional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		
		aluno.setId(alunoId);
		aluno = alunoService.salvar(aluno);
		
		return ResponseEntity.ok(aluno);
	}
	
	@DeleteMapping("/{alunoId}")
	public ResponseEntity<Void> remover(@PathVariable Long alunoId) {
		Optional<Aluno> alunoOptional = alunoService.findById(alunoId);
		
		if (!alunoOptional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		alunoService.excluir(alunoId);
		
		return ResponseEntity.noContent().build();
	}

}
