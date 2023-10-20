package com.example.apiagendamento.services;

import com.example.apiagendamento.dtos.CursosDTO;
import com.example.apiagendamento.exceptions.RegraNegocioException;
import com.example.apiagendamento.models.Cursos;
import com.example.apiagendamento.repositories.CursoRepository;
import com.example.apiagendamento.repositories.ProfessorRepository;

import jakarta.transaction.Transactional;

public class CursoServiceImpl implements CursosService {
    private final CursoRepository cursoRepository;
    private final ProfessorRepository professorRepository;

    @Override
    @Transactional
    public Cursos salvar(CursosDTO cursoDTO) {
        ProfessorRepository professorRepository = professorRepository
                .findById(cursoDTO.getProfessor_id())
                .orElseThrow(() -> new RegraNegocioException("Professor não encontrado"));
        Cursos curso = new Cursos();
        curso.setDescricao(cursoDTO.getDescricao());
        curso.setCarga_horaria(cursoDTO.getCarga_horaria());
        curso.setObjetivos(cursoDTO.getObjetivos());
        curso.setEmenta(cursoDTO.getEmenta());
        curso.setProfessor(professorRepository);
        return cursoRepository.save(curso);
    }
}
