package com.challengeforohub.Foro.Hub.domain.curso.dto;

import com.challengeforohub.Foro.Hub.domain.curso.Categoria;

public record ActualizarCursoDTO(
        String name,
        Categoria categoria,
        Boolean activo) {
}
