package Aula_11.Tarefa1;

public class Moto extends Automovel {

    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    public void empinar() {
        System.out.println("Moto empinando");
    }

    @Override
    public void acelera() {
        System.out.println("Moto acelerando");
    }

    @Override
    public void freia() {
        System.out.println("Moto freando");
    }
}
