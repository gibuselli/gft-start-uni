package PrimeiroDesafio;

public class Circulo implements AreaCalculavel {

    final double pi = 3.1415;
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return Math.round(this.pi * (this.raio * this.raio) * 100.0) / 100.0;
    }
}
