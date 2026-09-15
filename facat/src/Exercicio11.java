package flamingo.aprendendo.basico.facat.src;

import java.util.Scanner;

public class Exercicio11 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o salario fixo do funcionario:");
        double salarioFixo = sc.nextDouble();
        System.out.println("Digite a quantidade de carros vendidos");
        double numeroDeCarrosVendidos = sc.nextDouble();
        double salarioComPorcentual = salarioFixo * 0.05;
        double salarioComPorcentualFinal = salarioComPorcentual * numeroDeCarrosVendidos;
        double salarioComPorcentual1 = salarioComPorcentualFinal + salarioFixo;
        System.out.println("O valor do salario fixo é " + salarioFixo);
        System.out.println("O número de carros vendidos é igual:" + numeroDeCarrosVendidos);
        System.out.println(" O valor com o salario com a porcetagem é " + salarioComPorcentual1);
    }
}
