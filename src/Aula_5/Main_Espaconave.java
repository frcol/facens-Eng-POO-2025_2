package Aula_5;

public class Main_Espaconave {
    public static void main(String[] args) {
        Espaconave nave1 = new Espaconave();
        nave1.addArma("H45", "Ratata", 50);
        
        Arma a = new Arma("Glock",100, "paaaahhhhh");
        
        nave1.addArma(a);
        nave1.atira("H45");
        
        nave1.listarArmas();
        
        Espaconave nave2 = new Espaconave();
        nave2.addArma(a);
        
        nave2.atira("Glock");
    }
}
