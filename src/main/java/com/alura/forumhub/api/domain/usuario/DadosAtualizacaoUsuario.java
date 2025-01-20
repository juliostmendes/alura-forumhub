package com.alura.forumhub.api.domain.usuario;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoUsuario (
    @NotNull
    Long id,
    String nome,
    String senha
){
}
