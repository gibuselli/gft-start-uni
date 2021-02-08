package TerceiroDesafio;

import javax.swing.*;

public class Elefante {

    public static void main(String[] args) {

        String inicio = "Um elefante incomoda muita gente!";
        String incomoda = "";
        int repeticao = Integer.parseInt(JOptionPane.showInputDialog("Quantas vezes o elefante incomoda: "));

        for (int i = 0; i < repeticao; i++) {
            incomoda += "incomodam ";
        }

        String fim = repeticao + " elefantes " + incomoda + "muito mais!";

        System.out.println(inicio);
        System.out.println(fim);
    }
}
