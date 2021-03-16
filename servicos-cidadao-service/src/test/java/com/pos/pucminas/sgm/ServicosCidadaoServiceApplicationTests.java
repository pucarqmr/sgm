package com.pos.pucminas.sgm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import com.pos.pucminas.sgm.repository.EnderecoRepository;

@SpringBootTest
class ServicosCidadaoServiceApplicationTests {
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	@Sql({"/initial_data.sql"})
	public void testLoadDataForTestCase() {
	    assertEquals(2, enderecoRepository.findAll().size());
	}

}
