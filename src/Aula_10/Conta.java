package Aula_10;

public class Conta {
    private static int contador = 0;
    private int id;

    public Conta() {
        contador++;
        id = contador;
    }
    
    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    public void mostraContator() {
        System.out.println("Contador: "+contador);
    }
    
    public static void imprimr() {
        System.out.println("Contador: "+contador);
    }
}
