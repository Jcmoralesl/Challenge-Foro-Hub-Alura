package com.challengeforohub.Foro.Hub.domain.usuario.dto;

import com.challengeforohub.Foro.Hub.domain.usuario.Role;

public record ActualizarUsuarioDTO(
        String password,
        Role role,
        String nombre,
        String apellido,
        String email,
        Boolean enabled
) {
}
