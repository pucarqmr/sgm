package com.pos.pucminas.sgm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pos.pucminas.sgm.domain.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
	
	Aluno findByCpf(String cpf);

}
