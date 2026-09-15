package flamingo.aprendendo.basico.facat.src;

import java.util.Scanner;

public class Exercicio10 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do custo do carro: ");
        double valorDoCarro = sc.nextDouble();
        double porcetagemDistribuidor = valorDoCarro * 0.28;
        double porcetagemImposto = valorDoCarro * 0.45;
        double resultado = valorDoCarro + porcetagemDistribuidor + porcetagemImposto;
        System.out.println("O valor total do carro é no valor R$: " + resultado);
    }
}
