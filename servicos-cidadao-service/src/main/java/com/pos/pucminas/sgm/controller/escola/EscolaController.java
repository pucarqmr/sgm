package com.pos.pucminas.sgm.controller.escola;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pos.pucminas.sgm.domain.Escola;
import com.pos.pucminas.sgm.dto.EscolaDto;
import com.pos.pucminas.sgm.service.EscolaService;

@RestController
@RequestMapping("/escolas")
public class EscolaController {

	@Autowired
	private EscolaService escolaService;

	@Autowired
	private ModelMapper modelMapper;

	@GetMapping
	public List<EscolaDto> listar() {
		return toCollectionDto(escolaService.listarTodas());
	}

	private EscolaDto toDto(Escola escola) {
		return modelMapper.map(escola, EscolaDto.class);
	}

	private List<EscolaDto> toCollectionDto(List<Escola> escolas) {
		return escolas.stream().map(escola -> toDto(escola)).collect(Collectors.toList());
	}

}
