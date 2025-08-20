package Aula2.Tarefa;

import java.util.Scanner;

/*Exerc�cio 1: Calculadora Simples
Crie uma fun��o que simule uma calculadora simples. 
Ela deve receber dois n�meros e um operador (+, -, *, /) como par�metros e retornar o 
resultado da opera��o.
*/
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num1, num2;
        String operador;
        
        System.out.println("Digite um numero");
        num1 = scan.nextDouble();
        
        System.out.println("Digite outro numero");
        num2 = scan.nextDouble();
        
        System.out.println("Qual conta deseja fazer: +, -, * ou /");
        operador = scan.next();
        
        System.out.println("Resultado: " + Calcula(num1, num2, operador));
    }

    public static double Calcula(double x, double y, String operador) {
        double resultado = 0;

        switch (operador) {
            case "+":
                resultado = x + y;
                break;
            case "-":
                resultado = x - y;
                break;
            case "*":
                resultado = x * y;
                break;
            case "/":
                resultado = x / y;
                break;
        }

        return resultado;
    }
}
