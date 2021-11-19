package com.certistack.project.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.certistack.project.domain.Estudante;
import com.certistack.project.dtos.EstudanteDTO;
import com.certistack.project.services.EstudanteService;

@RestController
@RequestMapping(value="/estudante")
public class EstudanteController {

	@Autowired
	private EstudanteService service;
	
	@GetMapping
	public ResponseEntity<List<EstudanteDTO>> listarCertificados(){
		return new ResponseEntity<List<EstudanteDTO>>(HttpStatus.CREATED);
	}
	
	@PostMapping
    public ResponseEntity<Void> addEstudante(@RequestBody Estudante aluno){
    	aluno = service.addEstudante(aluno);
    	URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
    			.buildAndExpand(aluno.getIdUsuario()).toUri();
    	return ResponseEntity.created(uri).build();
    }
	
	@PutMapping("/{id}")
	public ResponseEntity<String> atualizarEstudante(@PathVariable(name = "idEstudante") Integer idEstudante, @RequestBody Estudante aluno) {
		try {
			aluno.setIdUsuario(idEstudante);
			service.atualizarEstudante(aluno);
			return new ResponseEntity<>(HttpStatus.CREATED);
		}catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
