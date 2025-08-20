package Aula1.Tarefa2;

/*
Criar um algoritmo que efetue o c�lculo do sal�rio 
l�quido de um professor. Os dados fornecidos ser�o: 
valor da hora aula, n�mero de aulas dadas no m�s e 
percentual de desconto do INSS.
 */
import java.util.Scanner;

public class ex08 {

    public static void main(String[] args) {
        double valorHora, qtdHoras, porcDesconto;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Valor da hora aula? ");
        valorHora = entrada.nextDouble();

        System.out.println("Quantidade de horas no mes? ");
        qtdHoras = entrada.nextInt();

        System.out.println("Porcentagem de desconto do INSS? ");
        porcDesconto = entrada.nextDouble();

        double salarioBruto = valorHora * qtdHoras;
        double salario = salarioBruto - (salarioBruto * (porcDesconto / 100));

        System.out.println("Salario li�quido: " + salario);

    }
}
