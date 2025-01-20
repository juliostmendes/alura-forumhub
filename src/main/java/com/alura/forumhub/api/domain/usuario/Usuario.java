package com.alura.forumhub.api.domain.usuario;

import jakarta.persistence.*;
import jakarta.validation.Valid;

@Table(name = "usuarios")
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String nome;
    private String email;
    private String senha;

    public Usuario(DadosCadastroUsuario dados){
        this.nome = dados.nome();
        this.email = dados.email();
        this.senha = dados.senha();
    }

    public Usuario(Long id, String nome, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public Usuario() {
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public void atualizarInformacoes(@Valid DadosAtualizacaoUsuario dados) {
        this.nome = dados.nome();
        this.senha = dados.senha();
    }
}
