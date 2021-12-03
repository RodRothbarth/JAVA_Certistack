package com.certistack.project.security;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.certistack.project.domain.Roles;

public class UserSpring implements UserDetails{
	private static final long serialVersionUID = 1L;
	
	private Integer idUsuario;
	private String email;
	private String senha;
	private Collection<? extends GrantedAuthority> authorities;
	
	public UserSpring() {}
	
	public UserSpring(Integer idUsuario, String email, String senha,
			Set<Roles> roles) {
		super();
		this.idUsuario = idUsuario;
		this.email = email;
		this.senha = senha;
		this.authorities = roles.stream().map(role -> new SimpleGrantedAuthority(role.getDescricao())).collect(Collectors.toList());
	}



	public Integer getIdUsuario() {
		return idUsuario;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Override
	public String getPassword() {
		return senha;
	}

	@Override
	public String getUsername() {
		return email;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	
	public boolean hasRole(Roles role) {
		return getAuthorities().contains(new SimpleGrantedAuthority(role.getDescricao()));
	}

}
