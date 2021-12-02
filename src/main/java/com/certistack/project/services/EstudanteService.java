package com.certistack.project.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.certistack.project.domain.Estudante;
import com.certistack.project.domain.Roles;
import com.certistack.project.repository.EstudanteRepository;
import com.certistack.project.security.UserSpring;

@Service
public class EstudanteService {
	@Autowired
	private EstudanteRepository estudanteRepository;
	
	public Estudante buscarEstudante(Integer id) {
		
		UserSpring user = UsuarioService.authenticated();
		if(user ==null || user.hasRole(Roles.ESTUDANTE)&& !id.equals(user.getIdUsuario())) {
			
		}
		Optional<Estudante> obj = estudanteRepository.findById(id);
		return obj.orElse(null);
	}
	
	public Estudante addEstudante(Estudante aluno) {
    	aluno.setIdUsuario(null);
    	return estudanteRepository.save(aluno);
    }
	
	public Estudante atualizarEstudante(Estudante aluno) {
			return estudanteRepository.save(aluno);
	}
	
}
