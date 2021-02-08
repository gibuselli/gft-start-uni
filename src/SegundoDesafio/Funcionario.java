package SegundoDesafio;

public class Funcionario extends Pessoa {

    private double salarioInicial;
    private double percentual;
    private double salarioTotal;

    @Override
    public String toString() {
        return "Funcionario " + super.getNome() +
                ", registrado sob RG nº " + super.getRg() +
                ", contratado com o salário inicial de: R$ " + this.getSalarioInicial() +
                ", cujo salário total em 2020 é de: R$ " + this.getSalarioTotal();
    }

    public double getSalarioInicial() {
        return salarioInicial;
    }

    public void setSalarioInicial(double salarioInicial) {
        this.salarioInicial = salarioInicial;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    public double getSalarioTotal() {
        return Math.round((salarioTotal) * 100.0) / 100.0;
    }

    public void setSalarioTotal() {
        this.salarioTotal = this.salarioInicial; // 2016

        this.salarioTotal += this.salarioTotal * (this.percentual / 100); // 2017

        this.percentual *= 2;
        this.salarioTotal += this.salarioTotal * (this.percentual / 100); // 2018

        this.percentual *= 2;
        this.salarioTotal += this.salarioTotal * (this.percentual / 100); // 2019

        this.percentual *= 2;
        this.salarioTotal += this.salarioTotal * (this.percentual / 100); // 2020

    }
}
