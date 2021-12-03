package com.certistack.project.resources;

import com.certistack.project.domain.Certificados;
import com.certistack.project.dtos.CertificadoDTO;
import com.certistack.project.services.CertificadoService;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping(value="/certificados")
public class CertificadoController {

    @Autowired
    private CertificadoService service;
    
    @GetMapping
	public ResponseEntity<List<Certificados>> listarCertificados(){
		return new ResponseEntity<List<Certificados>>(service.listarCertificados(), HttpStatus.OK);
	}

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarCertificadoPorId(@PathVariable Integer id) {
        return new ResponseEntity<Certificados>(service.buscarCertificado(id), HttpStatus.OK);
    }
    
    //@PreAuthorize("hasAnyRole('STUDENT')")
    @PostMapping
    public ResponseEntity<Void> addCertificado(@Valid @RequestBody CertificadoDTO certDTO){
    	Certificados cert = service.DTO(certDTO);
    	cert = service.addCertificado(cert);
    	URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
    			.buildAndExpand(cert.getIdCertificado()).toUri();
    	return ResponseEntity.created(uri).build();
    }
    
    @PutMapping("/{id}")
	public ResponseEntity<String> atualizarCertificado(@Valid @PathVariable(name = "idCertificado") Integer idcertificado, @RequestBody CertificadoDTO certDTO) {
		try {
			Certificados cert = service.DTO(certDTO);
			cert.setIdCertificado(idcertificado);
			service.atualizarCertificado(cert);
			return new ResponseEntity<>(HttpStatus.CREATED);
			}catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
    
    @DeleteMapping("/{id}")
	public ResponseEntity<Void> deletaCertificado(@PathVariable(name = "idCertificado") Integer idCertificado) {
		service.deletaCertificado(idCertificado);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
