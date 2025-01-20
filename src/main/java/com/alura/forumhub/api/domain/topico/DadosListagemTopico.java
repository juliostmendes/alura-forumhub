package com.alura.forumhub.api.domain.topico;

import java.time.LocalDate;

public record DadosListagemTopico(Long id, String titulo, String autor, LocalDate dataCriacao) {
    public DadosListagemTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getAutor(), topico.getDataCriacao());
    }

}
