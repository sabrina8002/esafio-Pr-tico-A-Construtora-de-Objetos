package geometria;

import java.util.Scanner;

public class CalculadoraFormas {

    private double comprimento;
    private double largura;
    private double altura;
    private double raio;
    private int escolha;

    public void exibirMenu() {
        System.out.println("1️⃣ Calcular Área do Quadrado");
        System.out.println("2️⃣ Calcular Área do Retângulo");
        System.out.println("3️⃣ Calcular Área do Triângulo");
        System.out.println("4️⃣ Calcular Área do Círculo");
        System.out.println("0️⃣ Sair");
    }

    public void iniciarCalculadora() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escolha uma opção (1-Quadrado, 2-Retângulo, 3-Triângulo, 4-Círculo, 0-Sair): ");
        escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                System.out.print("Digite o tamanho do lado do quadrado: ");
                comprimento = sc.nextDouble();
                System.out.printf("Área do quadrado: %.2f\n", comprimento * comprimento);
                break;

            case 2:
                System.out.print("Digite a largura do retângulo: ");
                largura = sc.nextDouble();
                System.out.print("Digite a altura do retângulo: ");
                altura = sc.nextDouble();
                System.out.printf("Área do retângulo: %.2f\n", largura * altura);
                break;

            case 3:
                System.out.print("Digite a base do triângulo: ");
                largura = sc.nextDouble();
                System.out.print("Digite a altura do triângulo: ");
                altura = sc.nextDouble();
                System.out.printf("Área do triângulo: %.2f\n", (largura * altura) / 2);
                break;

            case 4:
                System.out.print("Digite o raio do círculo: ");
                raio = sc.nextDouble();
                System.out.printf("Área do círculo: %.2f\n", 3.1416 * raio * raio);
                break;

            case 0:
                System.out.println("Saindo do programa...");
                break;

            default:
                System.out.println("Opção inválida! Tente novamente.");
        }

        sc.close();
    }
}
