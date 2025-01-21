package com.challengeforohub.Foro.Hub.domain.topico.dto;

import com.challengeforohub.Foro.Hub.domain.topico.Estado;

public record ActualizarTopicoDTO(
        String titulo,
        String mensaje,
        Estado estado,
        Long cursoId
) {
}
