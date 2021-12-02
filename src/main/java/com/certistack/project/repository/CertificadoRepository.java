package com.certistack.project.repository;

import com.certistack.project.domain.Certificados;
import com.certistack.project.domain.Estudante;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface CertificadoRepository extends JpaRepository<Certificados, Integer> {
	
	@Transactional(readOnly=true)

	List<Certificados> findByEstudante(Optional<Estudante> estudante);

}
