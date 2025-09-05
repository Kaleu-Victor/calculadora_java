import java.lang.Math;

public class Calculadora {
    private double num1;
    private double num2;

    public Calculadora() {
        this.num1 = 0;
        this.num2 = 0;
    }

    public Calculadora(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double soma() {
        return num1 + num2;
    }

    public double subtracao() {
        return num1 - num2;
    }

    public double multiplicacao() {
        return num1 * num2;
    }

    public double divisao() {
        if (num2 == 0) {
            throw new ArithmeticException("Erro: Divisão por zero não permitida!");
        }
        return num1 / num2;
    }

    public double potenciacao() {
        return Math.pow(num1, num2);
    }

    public double raiz() {
        if (num1 < 0) {
            throw new ArithmeticException("Erro: não é possível calcular raiz quadrada de número negativo!");
        }
        return Math.sqrt(num1);
    }
}