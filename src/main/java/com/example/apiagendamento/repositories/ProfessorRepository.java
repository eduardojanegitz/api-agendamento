package com.example.apiagendamento.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apiagendamento.models.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {
    // List<Professor> findA
}
