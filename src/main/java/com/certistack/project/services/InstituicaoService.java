package com.certistack.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.certistack.project.domain.Instituicao;
import com.certistack.project.repository.InstituicaoRepository;

@Service
public class InstituicaoService {
	
	@Autowired
	private InstituicaoRepository instituicaoRepository;
	
	public List<Instituicao> listarInstituicoes() {
		 return instituicaoRepository.findAll();
	}
	
	public Instituicao buscarInstituicao(Integer id) {
		Optional<Instituicao> obj = instituicaoRepository.findById(id);
		return obj.orElse(null);
	}
	
	public Instituicao addInstituicao(Instituicao inst) {
    	inst.setIdUsuario(null);
    	return instituicaoRepository.save(inst);
    }
	
	 public Instituicao atualizarInstituicao(Instituicao inst) {
			return instituicaoRepository.save(inst);
		}
	
}
