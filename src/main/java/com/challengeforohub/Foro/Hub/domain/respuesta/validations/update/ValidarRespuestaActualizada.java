package com.challengeforohub.Foro.Hub.domain.respuesta.validations.update;

import com.challengeforohub.Foro.Hub.domain.respuesta.dto.ActualizarRespuestaDTO;

public interface ValidarRespuestaActualizada {
    void validate(ActualizarRespuestaDTO data, Long respuestaId);
}
