import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        while (true) {

            System.out.println("\n----------Calculadora----------");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Potenciação");
            System.out.println("6. Raiz quadrada");
            System.out.println("7. Porcentagem");
            System.out.println("0. Sair");
            System.out.print("Escolha uma das opções acima: ");
            int op = in.nextInt();

            double resultado;
            try {
                switch (op) {
                    case 1:
                        System.out.print("\nDigite o primeiro número para a soma: ");
                        calc.setNum1(in.nextDouble());

                        System.out.print("Digite o segundo número para a soma: ");
                        calc.setNum2(in.nextDouble());

                        resultado = calc.soma();
                        System.out.printf("\n----------Resultado----------\n %.2f + %.2f = %.2f", calc.getNum1(), calc.getNum2(), resultado);
                        break;

                    case 2:
                        System.out.print("\nDigite o primeiro número da subtração: ");
                        calc.setNum1(in.nextDouble());

                        System.out.print("Digite o segundo número da subtração: ");
                        calc.setNum2(in.nextDouble());

                        resultado = calc.subtracao();
                        System.out.printf("\n----------Resultado----------\n %.2f - %.2f = %.2f", calc.getNum1(), calc.getNum2(), resultado);
                        break;

                    case 3:
                        System.out.print("\nDigite o primeiro número da multiplicação: ");
                        calc.setNum1(in.nextDouble());

                        System.out.print("Digite o segundo número da multiplicação: ");
                        calc.setNum2(in.nextDouble());

                        resultado = calc.multiplicacao();
                        System.out.printf("\n----------Resultado----------\n %.2f X %.2f = %.2f", calc.getNum1(), calc.getNum2(), resultado);
                        break;

                    case 4:
                        System.out.print("\nDigite o primeiro número da divisão(dividendo): ");
                        calc.setNum1(in.nextDouble());

                        System.out.print("Digite o segundo número da divisão(divisor): ");
                        calc.setNum2(in.nextDouble());

                        resultado = calc.divisao();
                        System.out.printf("\n----------Resultado----------\n %.2f / %.2f = %.2f", calc.getNum1(), calc.getNum2(), resultado);
                        break;

                    case 5:
                        System.out.print("\nDigite o primeiro número da potenciação(base): ");
                        calc.setNum1(in.nextDouble());

                        System.out.print("Digite o segundo número da potenciação(expoente): ");
                        calc.setNum2(in.nextDouble());

                        resultado = calc.potenciacao();
                        System.out.printf("\n----------Resultado----------\n %.2f ^ %.2f = %.2f", calc.getNum1(), calc.getNum2(), resultado);
                        break;

                    case 6:
                        System.out.print("Digite o número para a operação de raiz quadrada(radicando): ");
                        calc.setNum1(in.nextDouble());

                        resultado = calc.raiz();
                        System.out.printf("\n----------Resultado----------\n Raiz quadrada de: %.2f = %.2f", calc.getNum1(), resultado);
                        break;

                    case 7:
                        System.out.print("Digite a parte da qual deseja realizar a porcentagem: ");
                        calc.setNum1(in.nextDouble());

                        System.out.print("Digite o todo(valor total) da qual você quer calcular a porcentagem: ");
                        calc.setNum2(in.nextDouble());

                        resultado = calc.porcentagem();
                        System.out.printf("\n----------Resultado----------\n %.2f é %.2f%% de %.2f\n", calc.getNum1(), resultado, calc.getNum2());
                        break;

                    case 0:
                        System.out.println("Obrigado por usar a calculadora!");
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