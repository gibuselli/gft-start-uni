package PrimeiroDesafio;

public class Teste {

    public static void main(String[] args) {

        // teste área do quadrado
        Quadrado quadrado = new Quadrado(4);
        double quadradoArea = quadrado.calculaArea();
        System.out.println("Área do quadrado: " + quadradoArea);

        // teste área do retangulo
        Retangulo retangulo = new Retangulo(4, 8);
        double retanguloArea = retangulo.calculaArea();
        System.out.println("Área do retângulo: " + retanguloArea);

        // teste área do círculo
        Circulo circulo = new Circulo(3);
        double circuloArea = circulo.calculaArea();
        System.out.println("Área do círculo: " + circuloArea);
    }
}
