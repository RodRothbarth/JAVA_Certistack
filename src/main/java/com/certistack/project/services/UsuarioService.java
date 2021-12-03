package com.certistack.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.certistack.project.domain.Usuarios;
import com.certistack.project.repository.UsuarioRepository;
import com.certistack.project.security.UserSpring;

@Service
public class UsuarioService {
	

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<Usuarios> listarUsuarios() {
		 return usuarioRepository.findAll();
	}
	
	public Usuarios findByEmail(String email) {
		return usuarioRepository.findByEmail(email);
	}
	
	 public void deletaUsuario(Integer idUsuario) {
			usuarioRepository.deleteById(idUsuario);
		}

	 public static UserSpring authenticated() {
		 try {
			 return (UserSpring) SecurityContextHolder.getContext().getAuthentication().getPrincipal();			
		 }catch(Exception e) {
			 return null;
		 }
	 }
}
