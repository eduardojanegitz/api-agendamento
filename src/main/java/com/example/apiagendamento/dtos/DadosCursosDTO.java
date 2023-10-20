package com.example.apiagendamento.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DadosCursosDTO {
    private Long id;
    private String descricao;
    private String carga_horaria;
    private String objetivos;
    private String ementa;
    private ProfessorDTO professor;
}
