package com.deivis.financas.service;

import com.deivis.financas.model.Usuario;

public interface UsuarioServiceInterface {
    Usuario authenticar(String email, String senha);

    Usuario salvarUsuario(Usuario usuario);

    void validarEmail(String email);

}
