package com.challengeforohub.Foro.Hub.domain.curso.dto;

import com.challengeforohub.Foro.Hub.domain.curso.Categoria;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CrearCursoDTO(
    @NotBlank String name,
    @NotNull Categoria categoria) {

}

