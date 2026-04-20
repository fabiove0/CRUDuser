package com.fabio.usuario.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fabio.usuario.model.Usuario;
import com.fabio.usuario.repository.UsuarioRepository;

@Service
public class UsuarioService {
    
    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public Usuario salvarUsuario(Usuario usuario){
        return repository.save(usuario); 
    }

    public void deletarUsuario(Long id){
        repository.deleteById(id);
    }

    public List<Usuario> listarUsuarios(){
        return repository.findAll();
    }

    //tratar erro;
    public Usuario buscarUsuario(Long id){
    return repository.findById(id).orElse(null);
    }


    public Usuario atualizarUsuario(Long id, Usuario dadosNovos) {
    Usuario user = buscarUsuario(id);
    if (user != null) {
        user.setNome(dadosNovos.getNome());
        user.setEmail(dadosNovos.getEmail());
        return repository.save(user);
    }
    return null;
    }
}
}
