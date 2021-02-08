package QuartoDesafio;

import javax.swing.*;

public class HelloWorld {

    public static void main(String[] args) {
        String temp;
        String A = JOptionPane.showInputDialog("Digite a entrada A"); // world
        String B = JOptionPane.showInputDialog("Digite a entrada B"); // hello

        temp = A; // world
        A = B; // hello
        B = temp; // world

        System.out.println(A + " " + B); // Hello World
    }
}
