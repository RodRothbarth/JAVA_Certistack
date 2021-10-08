package com.certistack.project.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.certistack.project.domain.Estudante;
import com.certistack.project.repository.EstudanteRepository;

@Service
public class EstudanteService {
	@Autowired
	private EstudanteRepository estudanteRepository;
	
	public Estudante buscarEstudante(Integer id) {
		Optional<Estudante> obj = estudanteRepository.findById(id);
		return obj.orElse(null);
	}
}
