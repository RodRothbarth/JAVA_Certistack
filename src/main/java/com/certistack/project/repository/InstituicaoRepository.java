package com.certistack.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.certistack.project.domain.Instituicao;

@Repository
public interface InstituicaoRepository extends JpaRepository<Instituicao, Integer>{

}
