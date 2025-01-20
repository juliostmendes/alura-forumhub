package com.alura.forumhub.api.domain.topico;

import java.time.LocalDate;

public record DadosDetalhamentoTopico(Long id, String titulo, String mensagem, String autor, String curso, LocalDate dataCriacao, EnumStatus status) {
    public DadosDetalhamentoTopico(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getAutor(), topico.getCurso(), topico.getDataCriacao(), topico.getStatus());
    }
}
