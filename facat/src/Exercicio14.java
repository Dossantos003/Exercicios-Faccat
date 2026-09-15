package flamingo.aprendendo.basico.facat.src;

import java.util.Scanner;

public class Exercicio14 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        double numero;
        numero = sc.nextDouble();
        if (numero > 10){
            System.out.println("É MAIOR QUE 10");
        } else if (numero ==  10) {
            System.out.println("É IGUAL A 10");
        } else {
            System.out.println("NUMERO É MENOR QUE 10 ");
        }
    }
}
