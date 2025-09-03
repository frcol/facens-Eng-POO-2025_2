package Aula_3;


public class Main_Conta2 {

    public static void main(String[] args) {
       ContaBancaria c = new ContaBancaria();
       c.depositar(1000);
       c.imprimir();
       c.sacar(400);
       c.imprimir();
       c.sacar(2000);
       
    }

}
