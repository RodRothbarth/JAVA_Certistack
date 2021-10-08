package com.certistack.project.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.certistack.project.domain.Usuarios;
import com.certistack.project.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Usuarios bucarsUsuarios(Integer id) {
		Optional<Usuarios> obj = usuarioRepository.findById(id);
		return obj.orElse(null);
	}
}
