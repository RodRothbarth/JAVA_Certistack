package com.certistack.project.services;
import com.certistack.project.domain.Certificados;

import com.certistack.project.repository.CertificadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CertificadoService {

    @Autowired
    private CertificadoRepository certificadoRepository;

    public Certificados buscarCertificado(Integer id){
        Optional<Certificados> obj = certificadoRepository.findById(id);
        return obj.orElse(null);
    };

}