package Aula_11.Tarefa1;

public class Carro extends Automovel {

    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    public void abrirCapo() {
        System.out.println("Abrindo o capô do carro");
    }

    @Override
    public void acelera() {
        System.out.println("Carro acelerando");
    }

    @Override
    public void freia() {
        System.out.println("Carro freando");
    }
}
