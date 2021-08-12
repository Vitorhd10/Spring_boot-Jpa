package com.postgresql.estudo2.repository;

import com.postegresql.estudo2.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface usuarioRepository extends JpaRepository<Usuario, Long> {



}
