package com.certistack.project.resources;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.certistack.project.domain.Usuarios;
import com.certistack.project.services.UsuarioService;



@RestController
@RequestMapping(value="/usuario")
public class UsuarioController {

	 @Autowired
	    private UsuarioService service;
	 
	 @GetMapping
		public ResponseEntity<List<Usuarios>> listarCertificados(){
			return new ResponseEntity<List<Usuarios>>(HttpStatus.CREATED);
		}
	 
	 @DeleteMapping("/{id}")
		public ResponseEntity<Void> deletaCertificado(@PathVariable(name = "idUsuario") Integer idUsuario) {
			service.deletaUsuario(idUsuario);
			return new ResponseEntity<>(HttpStatus.OK);
		}
	
}
