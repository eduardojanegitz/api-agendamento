package com.example.apiagendamento.services;

import com.example.apiagendamento.dtos.CursosDTO;
import com.example.apiagendamento.models.Cursos;

public interface CursosService {
    Cursos salvar(CursosDTO cursosDTO);


}
