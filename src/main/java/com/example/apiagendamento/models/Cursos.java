package com.example.apiagendamento.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Cursos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String descricao;
    private String carga_horaria;
    private String objetivos;
    private String ementa;

    @ManyToMany
    @JoinTable(name = "professor_cursos", 
    joinColumns = @JoinColumn(name = "curso_id"), 
    inverseJoinColumns = @JoinColumn(name = "professor_id"))
    private List<Professor> professor;

    @OneToMany(mappedBy = "curso")
    List<Agendamento> agendamentos;

}
