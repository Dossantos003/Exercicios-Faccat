package flamingo.aprendendo.basico.facat.src;

import javax.swing.*;
import java.util.Scanner;

public class Exercicio05IG {
    JFrame quadroAviso;

    Exercicio05IG() {
        quadroAviso = new JFrame();
        JOptionPane.showMessageDialog(quadroAviso, "Programa Antecessor");
        String numero = JOptionPane.showInputDialog(quadroAviso,"Digite um numero para descobrir seu antecessor: ");
        int valor = Integer.parseInt(numero);
        int antecessor = valor -1;
        JOptionPane.showMessageDialog(quadroAviso, "O valor antecessor do numero digitado é: " + antecessor);
    }

    public static void main(String[] args) {

        new Exercicio05IG();


    }
}

