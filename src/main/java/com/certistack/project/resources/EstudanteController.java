package com.certistack.project.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.certistack.project.services.EstudanteService;

@RestController
@RequestMapping(value="/estudante")
public class EstudanteController {

	@Autowired
	private EstudanteService service;
}
