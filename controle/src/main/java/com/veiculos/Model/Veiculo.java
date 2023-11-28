package com.veiculos.Model;

public class Veiculo {

    private Long id;
    private String placa;
    private String modelo;
    private String marca;
    private String cor;
    private String ano;
    private String tipo;
    private String renavam;
    private Long idColaborador;
    private String matriculaColaborador;

    public Veiculo() {
    }

    public Veiculo(Long id, String placa, String modelo, String marca, String cor, String ano, String tipo,
            String renavam, Long idColaborador, String matriculaColaborador) {
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.tipo = tipo;
        this.renavam = renavam;
        this.idColaborador = idColaborador;
        this.matriculaColaborador = matriculaColaborador;
    }

    @Override
    public String toString() {
        return id + " | tipo: " + tipo + " | modelo: " + modelo + " | marca: " + marca +
                " | cor: " + cor + " | ano: " + ano +
                " | placa: " + placa +
                " | matriculaColaborador: " + matriculaColaborador;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public Long getIdColaborador() {
        return idColaborador;
    }

    public void setIdColaborador(Long idColaborador) {
        this.idColaborador = idColaborador;
    }

    public String getMatriculaColaborador() {
        return matriculaColaborador;
    }

    public void setMatriculaColaborador(String matriculaColaborador) {
        this.matriculaColaborador = matriculaColaborador;
    }

}
