package Aula_5;

public class Main_Calculadora {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        System.out.println(calc.calcular(5, 4));
        System.out.println(calc.calcular(3.5, 2.5));
        System.out.println(calc.calcular(3.5f, 2.5f));
        System.out.println(calc.calcular("4", "6"));
    }
}
