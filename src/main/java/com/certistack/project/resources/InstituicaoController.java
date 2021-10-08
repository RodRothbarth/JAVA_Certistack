package com.certistack.project.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.certistack.project.services.InstituicaoService;

@RestController
@RequestMapping(value="/instituicao")
public class InstituicaoController {

	@Autowired
	private InstituicaoService service;
}
