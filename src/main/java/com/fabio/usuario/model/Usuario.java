package com.fabio.usuario.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.*;

@Entity
@Table(name= "usuario")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    
    @NotBlank(message = "Nome não pode ser vazio")
    @Size(min = 3, max = 50)
    private String nome;
    
    @Email
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

}
