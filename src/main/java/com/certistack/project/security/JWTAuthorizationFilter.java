package com.certistack.project.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import com.certistack.project.services.UserSecurityService;

public class JWTAuthorizationFilter extends BasicAuthenticationFilter {
	
	private JWTUtil jwtUtil;
	
	private UserSecurityService userDetailService;
	
	public JWTAuthorizationFilter(AuthenticationManager authenticationManager, JWTUtil jwtUtil, UserSecurityService userDetailsService) {
		super(authenticationManager);
		this.jwtUtil = jwtUtil;
		this.userDetailService = userDetailsService; 
	}
	
	protected void filtroInterno(HttpServletRequest req,
								HttpServletResponse res, 
								FilterChain chain) throws IOException, ServletException{
		String reqHeader = req.getHeader("Authorization");
		if(reqHeader != null && reqHeader.startsWith("Bearer ")) {
			UsernamePasswordAuthenticationToken auth = getAuthentication(reqHeader.substring(7));
			if(auth != null) {
				SecurityContextHolder
				.getContext()
				.setAuthentication(auth);			}
		}
		chain.doFilter(req, res);
	}

	private UsernamePasswordAuthenticationToken getAuthentication(String token) {
		if(jwtUtil.tokenValido(token)) {
			String Username = jwtUtil.getUsername(token);
			UserDetails user = userDetailService.loadUserByUsername(Username);
			return new UsernamePasswordAuthenticationToken(user, null, user.getAuthorities());
		}
		return null;
	}



}
