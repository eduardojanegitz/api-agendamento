package com.example.apiagendamento.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DadosAgendamentoDTO {
    private Long id;
    private Date dataInicio;
    private Date dataFim;
    private String horarioInicio;
    private String horarioFim;
    private String cidade;
    private String estado;
    private String cep;
    private CursosDTO cursos;
    private ProfessorDTO professor;
}
