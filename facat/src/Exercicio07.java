package flamingo.aprendendo.basico.facat.src;

import java.util.Scanner;

public class Exercicio07 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade para descobrir quantos dias você ja viveu: ");
        double idade = (double)sc.nextByte();
        System.out.println("Digite o meses adicionais");
        double meses = sc.nextDouble();
        System.out.println("Digite os dias adicionais ");
        double dias = (double)sc.nextByte();
        double diasDeVida = idade * (double)365.0F + meses * (double)30.0F + dias;
        System.out.printf("Sua idade em dias é %.0f", diasDeVida);
        sc.close();
    }
}
