package Aula_10;

public class Main_Conta {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.mostraContator();
        
        Conta c2 = new Conta();
        c2.mostraContator();
        
        Conta c3 = new Conta();
        c3.mostraContator();
        
        c1.mostraContator();
        c2.setContador(99);
        
        Conta.imprimr();
    }
}
