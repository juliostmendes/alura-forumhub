package com.alura.forumhub.api.domain.topico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Table(name = "topicos")
@Entity(name = "topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String mensagem;
    private LocalDate dataCriacao;

    @Enumerated(EnumType.STRING)
    private EnumStatus status;

    private String autor;
    private String curso;

    public Topico(DadosCadastroTopico dados){
        this.titulo = dados.titulo();
        this.mensagem = dados.mensagem();
        this.dataCriacao = LocalDate.parse(dados.dataCriacao());
        this.status = dados.status();
        this.autor = dados.autor();
        this.curso = dados.curso();
    }

    public Topico() {
    }

    public void atualizarInformacoes(DadosAtualizacaoTopico dados){
        if(dados.titulo() != null){
            this.titulo = dados.titulo();
        }
        if(dados.mensagem() != null){
            this.mensagem = dados.mensagem();
        }
    }

    public void excluir(){
        this.status = EnumStatus.INATIVO;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public EnumStatus getStatus() {
        return status;
    }

    public String getAutor() {
        return autor;
    }

    public String getCurso() {
        return curso;
    }
}
