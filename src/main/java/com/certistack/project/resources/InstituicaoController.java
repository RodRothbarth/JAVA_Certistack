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

import com.certistack.project.domain.Instituicao;
import com.certistack.project.dtos.InstituicaoDTO;
import com.certistack.project.services.InstituicaoService;

@RestController
@RequestMapping(value="/instituicao")
public class InstituicaoController {

	@Autowired
	private InstituicaoService service;
	
	@GetMapping
	public ResponseEntity<List<InstituicaoDTO>> listarCertificados(){
		return new ResponseEntity<List<InstituicaoDTO>>(HttpStatus.CREATED);
	}
	
	@PostMapping
    public ResponseEntity<Void> addInstituicao(@RequestBody Instituicao inst){
    	inst = service.addInstituicao(inst);
    	URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
    			.buildAndExpand(inst.getIdUsuario()).toUri();
    	return ResponseEntity.created(uri).build();
    }
	
	@PutMapping("/{id}")
	public ResponseEntity<String> atualizarInstituicao(@PathVariable(name = "idUsuario") Integer idInstituicao, @RequestBody Instituicao inst) {
		try {
			inst.setIdUsuario(idInstituicao);
			service.atualizarInstituicao(inst);
			return new ResponseEntity<>(HttpStatus.CREATED);
		}catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
