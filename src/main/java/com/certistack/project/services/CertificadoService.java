package com.certistack.project.services;
import com.certistack.project.domain.Certificados;
import com.certistack.project.dtos.CertificadoDTO;
import com.certistack.project.repository.CertificadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CertificadoService {

    @Autowired
    private CertificadoRepository certificadoRepository;
    
    public List<CertificadoDTO> listarCertificados() {
		 return certificadoRepository.findAll().stream()
				 .map(cert -> new CertificadoDTO(cert.getIdCertificado(), cert.getEventName(), cert.getHours(), cert.getCountry(), cert.getCity(), cert.getIdealizer(), cert.getBeginData(), cert.getEndDate(), cert.getValidation(), cert.getType(), cert.getEstudante()))
				 .collect(Collectors.toList());
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
    

}