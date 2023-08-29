package com.example.userregistration.mapper;

import com.example.userregistration.dto.UsuarioDTO;
import com.example.userregistration.model.Usuario;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UsuarioMapper {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static UsuarioDTO usuarioToUsuarioDTO(Usuario usuario) {
        return objectMapper.convertValue(usuario, UsuarioDTO.class);
    }

    public static Usuario usuarioDTOToUsuario(UsuarioDTO usuarioDTO) {
        return objectMapper.convertValue(usuarioDTO, Usuario.class);
    }
}
