package com.certistack.project.repository;

import com.certistack.project.domain.Certificados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertificadoRepository extends JpaRepository<Certificados, Integer> {
}
