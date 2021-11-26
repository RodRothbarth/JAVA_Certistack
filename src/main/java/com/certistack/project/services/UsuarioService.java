package com.certistack.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.certistack.project.domain.Usuarios;
import com.certistack.project.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<Usuarios> listarUsuarios() {
		 return usuarioRepository.findAll();
	}
	
	 public void deletaUsuario(Integer idUsuario) {
			usuarioRepository.deleteById(idUsuario);
		}
}
