package com.aula8;

// Class client that extends the class Pessoa
public class Cliente extends Pessoa {
    
    // Attributes
    Double valorDivida;
    Integer anoNascim;

    // Constructor
    public Cliente(String nome, Integer idade, String sexo, Double valorDivida, Integer anoNascim) {
        super(nome, idade, sexo);
        this.valorDivida = valorDivida;
        this.anoNascim = anoNascim;
    }

    // Methods
    public Double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(Double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public Integer getAnoNascim() {
        return anoNascim;
    }

    public void setAnoNascim(Integer anoNascim) {
        this.anoNascim = anoNascim;
    }

}