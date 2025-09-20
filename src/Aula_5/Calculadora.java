package Aula_5;

public class Calculadora {
    public int calcular(int x, int y) {
        System.out.println("Inteiro");
        return x + y;
    }
    
    public double calcular(double x, double y) {
        System.out.println("Double");
        return x + y;
    }
    
    public float calcular(float x, float y) {
        System.out.println("float");
        return x + y;
    }
    
    public int calcular(String x, String y) {
        System.out.println("String");
        return Integer.parseInt(x) + Integer.parseInt(y);
    }
}
