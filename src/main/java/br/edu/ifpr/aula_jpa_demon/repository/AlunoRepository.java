package br.edu.ifpr.aula_jpa_demon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifpr.aula_jpa_demon.model.Aluno;

//<classe d entidade, tipo primary key>
public interface AlunoRepository extends JpaRepository<Aluno, Long>{
    
}
