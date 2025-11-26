package Aula_11.Tarefa1;

public class Animal {
    protected String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    public void alimentar() {
        System.out.println("Animal se alimentando");
    }
}
