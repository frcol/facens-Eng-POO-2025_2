package Aula_11;

public class CarroAutmatico extends Carro implements IAutomatico{

    public CarroAutmatico(String nome, int numPortas) {
        super(nome, numPortas);
    }
    
    public void mudaMarchaAutomatico() {
        System.out.println("Mudou marcha automaticamente");
    }
    
}
