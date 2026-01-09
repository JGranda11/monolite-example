package com.pragma.gestioncursos.__gestion_cursos.repository;

import com.pragma.gestioncursos.__gestion_cursos.entity.Curso;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {

    //podemos definir metodos personalizados
    Page<Curso>findByTituloContainingIgnoreCase(String keyword, Pageable pageable);
}
