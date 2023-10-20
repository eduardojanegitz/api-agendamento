package com.example.apiagendamento.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 200, nullable = false)
    private String nome;
    @Column(length = 200, nullable = false)
    private String cpf;
    @Column(length = 200, nullable = false)
    private String rg;
    @Column(length = 600, nullable = false)
    private String endereco;
    @Column(length = 20, nullable = false)
    private String celular;

    @ManyToMany(mappedBy = "cursos")
    private List<Cursos> cursos;

    @OneToMany(mappedBy = "professor")
    private List<Agendamento> agendamentos;

}
