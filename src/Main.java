import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        while (true) {

            System.out.print("\nDigite o primeiro número: ");
            double num1 = in.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = in.nextDouble();

            System.out.println("\n----------Calculadora----------\n");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("0. Sair\n");
            System.out.println("Escolha uma das opções acima: ");
            int op = in.nextInt();

            double resultado = 0;
            try {
                switch (op) {
                    case 1:
                        resultado = calc.soma(num1, num2);
                        System.out.print("\n----------Resultado----------\n" + num1 + " + " + num2 + " = " + resultado + "\n");
                        break;

                    case 2:
                        resultado = calc.subtracao(num1, num2);
                        System.out.print("\n----------Resultado----------\n" + num1 + " - " + num2 + " = " + resultado + "\n");
                        break;

                    case 3:
                        resultado = calc.multiplicacao(num1, num2);
                        System.out.print("\n----------Resultado----------\n" + num1 + " X " + num2 + " = " + resultado + "\n");
                        break;

                    case 4:
                        resultado = calc.divisao(num1, num2);
                        System.out.println("\n----------Resultado----------\n" + num1 + " / " + num2 + " = " + resultado + "\n");
                        break;

                    case 0:
                        System.out.println("Sistema encerrado.");
                        in.close();
                        return;

                    default:
                        System.out.println("Opção inválida!\n");
                }
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}