package com.alura.forumhub.api.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroTopico(
        @NotBlank
        String titulo,

        @NotBlank
        String mensagem,

        @NotBlank
        String dataCriacao,

        @NotNull
        EnumStatus status,

        @NotBlank
        String autor,

        String curso
) {
}
