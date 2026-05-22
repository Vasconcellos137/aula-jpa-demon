package br.edu.ifpr.aula_jpa_demon.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//@Entity(name = "nome tabela") -> usada p quando a tabela n tiver msm nome q classe

// Annotação q diz q a classe é persistente
@Entity
public class Aluno {

    // primary key e auto increment
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    
    public Aluno(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Aluno() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
