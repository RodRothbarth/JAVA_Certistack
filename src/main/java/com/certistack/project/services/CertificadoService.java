package com.certistack.project.services;
import com.certistack.project.domain.Certificados;
import com.certistack.project.domain.Estudante;
import com.certistack.project.dtos.CertificadoDTO;
import com.certistack.project.repository.CertificadoRepository;
import com.certistack.project.repository.EstudanteRepository;
import com.certistack.project.security.UserSpring;
import com.certistack.project.services.exceptions.AuthorizationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CertificadoService {

    @Autowired
    private CertificadoRepository certificadoRepository;
    
    @Autowired
	private EstudanteRepository estudanteRepository;
    
    public List<Certificados> listarCertificados() {
           return certificadoRepository.findAll();
	}

    public Certificados buscarCertificado(Integer id){
        Optional<Certificados> obj = certificadoRepository.findById(id);
        return obj.orElse(null);
    };
    
    public Certificados addCertificado(Certificados cert) {
    	cert.setIdCertificado(null);
    	return certificadoRepository.save(cert);
    }
    
    public Certificados atualizarCertificado(Certificados cert) {
		return certificadoRepository.save(cert);
	}
    
    public void deletaCertificado(Integer idCertificado) {
		certificadoRepository.deleteById(idCertificado);
	}
    
    public Certificados DTO(CertificadoDTO cert) {
    	return new Certificados(cert.getIdCertificado(), cert.getEventName(), cert.getHours(), cert.getCountry(), cert.getCity(), cert.getIdealizer(), cert.getBeginData(), cert.getEndDate(), cert.getValidation(), cert.getType(), cert.getEstudante());	
    }
    
    public List<Certificados> usuarioLogado(){
    	
    	UserSpring user = UsuarioService.authenticated();
    	if(user == null){
    		throw new AuthorizationException("Acesso Negado");
    	}
    	
    	Optional<Estudante> estudante = estudanteRepository.findById(user.getIdUsuario());
    	return certificadoRepository.findByEstudante(estudante);
    	
    }
    

}