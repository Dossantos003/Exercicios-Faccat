package flamingo.aprendendo.basico.facat.src;

import java.util.Scanner;

public class Exercicio12 {
    static void main() {

        Scanner sc = new Scanner(System.in);
        double celsius, fahrenheit;
        System.out.println("Digite a temperatura em fahrenheit :");
        fahrenheit = sc.nextDouble();
        celsius = (fahrenheit - 32) * 5/ 9;
        System.out.println("A temperatura em graus celsius é " + celsius);



    }
}
