package com.deivis.financas.service;

import com.deivis.financas.model.Usuario;
import com.deivis.financas.repository.UsuarioRepository;

public class UsuarioService implements UsuarioServiceInterface {

    private UsuarioRepository usuarioRepository;
    @Override
    public Usuario authenticar(String email, String senha) {
        return null;
    }

    @Override
    public Usuario salvarUsuario(Usuario usuario) {
        return null;
    }

    @Override
    public void validarEmail(String email) {

    }
}
