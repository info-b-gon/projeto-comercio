package br.com.senai.infob.backend.projeto_comercio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.infob.backend.projeto_comercio.models.Usuario;
import br.com.senai.infob.backend.projeto_comercio.repositories.UsuarioRepository;

@Service
public class UsuarioService {
  
  @Autowired
  private UsuarioRepository usuarioRepository;

  public Usuario cadastrar(Usuario usuario) {
    return usuarioRepository.save(usuario);
  }

  public Usuario logar(String email, String senha) {
    Usuario usuario = usuarioRepository.findByEmail(email);
    if (usuario != null && usuario.getSenha().equals(senha)) {
      return usuario;
    }
    return null;
  }
}