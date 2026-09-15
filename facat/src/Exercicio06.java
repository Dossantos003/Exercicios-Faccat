package flamingo.aprendendo.basico.facat.src;

import java.util.Scanner;

public class Exercicio06 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a base do retângulo");
        double base = sc.nextDouble();
        System.out.println("Digite a altura do retângulo");
        double altura = sc.nextDouble();
        double area = base * altura;
        System.out.printf("A área do retângulo é %.2f", area);
    }
}
