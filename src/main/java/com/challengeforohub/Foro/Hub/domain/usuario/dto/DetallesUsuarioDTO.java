package com.challengeforohub.Foro.Hub.domain.usuario.dto;

import com.challengeforohub.Foro.Hub.domain.usuario.Role;
import com.challengeforohub.Foro.Hub.domain.usuario.Usuario;

public record DetallesUsuarioDTO(
        Long id,
        String username,
        Role role,
        String nombre,
        String apellido,
        String email,
        Boolean enabled
) {
    public DetallesUsuarioDTO(Usuario usuario){
        this(usuario.getId(),
                usuario.getUsername(),
                usuario.getRole(),
                usuario.getNombre(),
                usuario.getApellido(),
                usuario.getEmail(),
                usuario.getEnabled()
        );
    }
}
