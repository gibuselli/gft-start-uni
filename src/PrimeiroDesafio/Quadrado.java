package PrimeiroDesafio;

public class Quadrado implements AreaCalculavel {

    double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calculaArea() {
        return this.lado * this.lado;
    }
}
