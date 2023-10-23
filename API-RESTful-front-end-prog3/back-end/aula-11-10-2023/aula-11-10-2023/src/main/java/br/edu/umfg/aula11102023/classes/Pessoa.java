package br.edu.umfg.aula11102023.classes;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Pessoa {

    private UUID id;
    private String nome;
    private String sobreNome;
    private String documento;

    public UUID getId() {
        return id;
    }

    public Pessoa(@JsonProperty("name") String nome,
                  @JsonProperty("/lastname") String sobreNome, @JsonProperty("document") String documento) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.documento = documento;
    }
}
