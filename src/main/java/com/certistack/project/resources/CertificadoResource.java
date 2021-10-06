package com.certistack.project.resources;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.certistack.project.domain.Certificados;


@RestController
@RequestMapping(value="/certificados")
public class CertificadoResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Certificados> listar() {
		
	Certificados cert = new Certificados();
	Certificados cert2 = new Certificados(1, "teste", 30, "brasil", "florianopolis", "UFSC", "2021-09-09", "2021-09-09", false);
	
	List<Certificados> lista = new ArrayList<>();
	lista.add(cert);
	lista.add(cert2);
		
		return lista;
	}
	
}
