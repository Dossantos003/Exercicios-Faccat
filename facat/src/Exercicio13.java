package flamingo.aprendendo.basico.facat.src;

import java.util.Scanner;

public class Exercicio13 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double[] n = new double[3];
        for (int i = 0 ; i< n.length ; i ++){
            System.out.println("Digite a nota do aluno:");
            n[i] = sc.nextDouble();
        }
        double n1 =n[0];
        double n2 =n[1];
        double n3 =n[2];
        double media;
        media = ((n1 * 2) + (n2 * 3) + (n3 * 5) )/ 10;
        System.out.println("O resultado da nota é " + media);

    }
}
