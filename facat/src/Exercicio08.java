package flamingo.aprendendo.basico.facat.src;

import java.util.Scanner;

public class Exercicio08 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o total de eleitores Municipal:");
        double eleitores = sc.nextDouble();
        System.out.println("Digite o total de votos brancos:");
        double brancos = sc.nextDouble();
        System.out.println("Digite o total de votos validos: ");
        double validos = sc.nextDouble();
        System.out.println("Digite o total de votos nulos:");
        double nulos = sc.nextDouble();
        double porcentualbrancos = brancos / eleitores * (double)100.0F;
        double porcentualnulo = nulos / eleitores * (double)100.0F;
        double porcentualvalido = validos / eleitores * (double)100.0F;
        System.out.println();
        sc.close();
    }
}
