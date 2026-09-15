package flamingo.aprendendo.basico.facat.src;

import java.util.Scanner;

public class Exercicio09 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor mensal do salario: ");
        double salario = sc.nextDouble();
        System.out.println("Digite o valor do porcentual: ");
        double porcentagem = (double)sc.nextInt();
        double resultadoPorcentagem = salario * porcentagem / (double)100.0F;
        double resultado = salario + resultadoPorcentagem;
        System.out.println("O valor do salario mensal é : " + resultado);
    }
}
