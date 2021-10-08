package com.certistack.project.resources;

import com.certistack.project.domain.Certificados;
import com.certistack.project.services.CertificadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/certificados")
public class CertificadoController {

    @Autowired
    private CertificadoService service;

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarCertificadoPorId(@PathVariable Integer id) {
        return new ResponseEntity<Certificados>(service.buscarCertificado(id), HttpStatus.OK);
    }
}
