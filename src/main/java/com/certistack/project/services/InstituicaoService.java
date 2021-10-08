package com.certistack.project.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.certistack.project.domain.Instituicao;
import com.certistack.project.repository.InstituicaoRepository;

@Service
public class InstituicaoService {
	
	@Autowired
	private InstituicaoRepository instituicaoRepository;
	
	public Instituicao buscarInstituicao(Integer id) {
		Optional<Instituicao> obj = instituicaoRepository.findById(id);
		return obj.orElse(null);
	}
	
}
