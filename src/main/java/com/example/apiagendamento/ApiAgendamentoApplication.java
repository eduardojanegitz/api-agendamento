package com.example.apiagendamento;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.apiagendamento.models.Professor;
import com.example.apiagendamento.repositories.CursoRepository;
import com.example.apiagendamento.repositories.ProfessorRepository;

@SpringBootApplication
public class ApiAgendamentoApplication {

	@Bean
	public CommandLineRunner init(
			@Autowired ProfessorRepository professorRepository) {
		return args -> {
			professorRepository.save(
					new Professor((1, "Arnaldo", "1", "1", "naosei", "1", "1"));
			List<Professor> listaProfessores = professorRepository.findAll();
			listaProfessores.forEach(System.out::println);


		};
	}

	public static void main(String[] args) {
		SpringApplication.run(ApiAgendamentoApplication.class, args);
	}

}
