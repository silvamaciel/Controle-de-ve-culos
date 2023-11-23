package com.veiculos.Model;

public class Colaborador {
    
    private Long id;
    private String nome;
    private String matricula;
    private String cnh;

    public Colaborador() {}

    public Colaborador(Long id, String nome, String matricula, String cnh) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.cnh = cnh;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
    
    
}
