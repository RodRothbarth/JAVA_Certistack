package com.certistack.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.certistack.project.domain.Estudante;

@Repository
public interface EstudanteRepository extends JpaRepository<Estudante, Integer>{

}
