package com.fabio.usuario.controller;
import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.fabio.usuario.model.Usuario;
import com.fabio.usuario.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    
    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
        
    }

    @PostMapping
    public Usuario criar(@RequestBody Usuario usuario) {
        return service.salvarUsuario(usuario);
    }

    @GetMapping
    public List<Usuario> listar() {
        return service.listarUsuarios();
    }   

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletarUsuario(id);
    }


    @PutMapping("/{id}")
    public Usuario atualizar(@PathVariable Long id, @RequestBody Usuario usuario) {
        return service.atualizarUsuario(id, usuario);
    }

//tratar erro:
    @GetMapping("/{id}")
    public Usuario buscar(@PathVariable Long id){
        return service.buscarUsuario(id);
    }



}
