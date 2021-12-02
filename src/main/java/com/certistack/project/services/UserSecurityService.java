package com.certistack.project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.certistack.project.domain.Usuarios;
import com.certistack.project.repository.UsuarioRepository;
import com.certistack.project.security.UserSpring;

@Service
public class UserSecurityService implements UserDetailsService{

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Usuarios user = usuarioRepository.findByEmail(email);
		if(user == null) {
			throw new UsernameNotFoundException(email);
		}
		return new UserSpring(user.getIdUsuario(), user.getEmail(), user.getSenha(), user.getRoles());
	}

}
