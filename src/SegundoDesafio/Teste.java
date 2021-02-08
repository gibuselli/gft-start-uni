package SegundoDesafio;

public class Teste {

    public static void main(String[] args) {

        Funcionario fulano = new Funcionario();
        fulano.setNome("Fulano");
        fulano.setRg("12.345.678-9");
        fulano.setSalarioInicial(1000.0);
        fulano.setPercentual(1.5);

        // teste setSalarioTotal
        fulano.setSalarioTotal();

        System.out.println(fulano);
    }
}
