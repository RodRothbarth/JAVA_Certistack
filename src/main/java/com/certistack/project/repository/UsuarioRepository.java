package com.certistack.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.certistack.project.domain.Usuarios;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuarios, Integer>{

}
