package Aula_3;

public class ContaBancaria {
    // atributos
    private String id;
    private double saldo;
    
    // metodos acessores e modificadores
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Deposito: "+valor);
    }
    
    public void sacar(double valor) {
        if (saldo - valor < 0) {
            System.out.println("Saldo insuficiente");
        }
        else {
            saldo -= valor;
            System.out.println("Saque: "+valor);
        }
    }
    
    // ======================================
    
    public void imprimir() {
        System.out.println("Saldo: "+saldo);
    }
}
