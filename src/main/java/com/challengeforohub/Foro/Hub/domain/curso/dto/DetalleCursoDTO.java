package com.challengeforohub.Foro.Hub.domain.curso.dto;

import com.challengeforohub.Foro.Hub.domain.curso.Categoria;
import com.challengeforohub.Foro.Hub.domain.curso.Curso;

public record DetalleCursoDTO(
    Long id,
    String name,
    Categoria categoria,
    Boolean activo) {

    public DetalleCursoDTO(Curso curso) {
        this(
                curso.getId(),
                curso.getName(),
                curso.getCategoria(),
                curso.getActivo());

    }
}
