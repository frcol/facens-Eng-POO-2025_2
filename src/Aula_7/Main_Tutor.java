package Aula_7;

public class Main_Tutor {
    public static void main(String[] args) {
        Tutor t = new Tutor("Fabio", "123123");
        
        Pet p1 = new Pet("Xodo", "Cao", 13);
        Pet p2 = new Pet("Lize", "Gato", 9);
        
        t.addPet(p1);
        t.addPet(p2);
        
        System.out.println(t.imprimir());
    }
}
