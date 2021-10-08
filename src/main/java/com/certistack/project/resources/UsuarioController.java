package com.certistack.project.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.certistack.project.services.UsuarioService;

@RestController
@RequestMapping(value="/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService service;
	
}
