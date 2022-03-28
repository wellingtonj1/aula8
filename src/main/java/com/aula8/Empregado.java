package com.aula8;

public class Empregado extends Pessoa {

    Double salario;
    String matricula;

    // Constructor
    public Empregado(String nome, Integer idade, String sexo, Double salario, String matricula) {
        super(nome, idade, sexo);
        this.salario = salario;
        this.matricula = matricula;
    }

    // Methods
    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getValorInss() {
        return (salario - (salario * 0.05));
    }

}
