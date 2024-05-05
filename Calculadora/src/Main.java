import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        char opcao;

        do {
            System.out.println("Escolha a operação:");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Potência");
            System.out.println("6 - Raiz Quadrada");
            System.out.println("Q - Sair");

            opcao = scanner.next().charAt(0);

            switch (opcao) {
                case '1':
                    System.out.println("Digite o primeiro número:");
                    double num1 = scanner.nextDouble();
                    System.out.println("Digite o segundo número:");
                    double num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + calculadora.adicao(num1, num2));
                    break;
                case '2':
                    System.out.println("Digite o primeiro número:");
                    num1 = scanner.nextDouble();
                    System.out.println("Digite o segundo número:");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + calculadora.subtracao(num1, num2));
                    break;
                case '3':
                    System.out.println("Digite o primeiro número:");
                    num1 = scanner.nextDouble();
                    System.out.println("Digite o segundo número:");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + calculadora.multiplicacao(num1, num2));
                    break;
                case '4':
                    System.out.println("Digite o primeiro número:");
                    num1 = scanner.nextDouble();
                    System.out.println("Digite o segundo número:");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + calculadora.divisao(num1, num2));
                    break;
                case '5':
                    System.out.println("Digite o primeiro número:");
                    num1 = scanner.nextDouble();
                    System.out.println("Digite o segundo número:");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + calculadora.potencia(num1, num2));
                    break;
                case '6':
                    System.out.println("Digite o número:");
                    num1 = scanner.nextDouble();
                    System.out.println("Resultado: " + calculadora.raizQuadrada(num1));
                    break;
                case 'Q':
                case 'q':
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 'Q' && opcao != 'q');

        scanner.close();
    }
}