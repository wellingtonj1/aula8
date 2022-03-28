package com.aula8;

public class Vendedor extends Empregado {

    Double valorVendas;
    Integer qntVendas;

    public Vendedor(String nome, Integer idade, String sexo, Double salario, String matricula, Double valorVendas, Integer qntVendas) {
        super(nome, idade, sexo, salario, matricula);
        this.valorVendas = valorVendas;
        this.qntVendas = qntVendas;
    }

    public Double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(Double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public Integer getQntVendas() {
        return qntVendas;
    }

    public void setQntVendas(Integer qntVendas) {
        this.qntVendas = qntVendas;
    }

}
