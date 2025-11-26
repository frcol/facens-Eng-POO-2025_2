package Aula_11;

import java.util.ArrayList;

public class Main_Interface {
    public static void main(String[] args) {
        ArrayList<IAutomatico> lstAutomaticos = new ArrayList<>();
        
        MotoAutomatica m1 = new MotoAutomatica("XPTO");
        CarroAutmatico c1 = new CarroAutmatico("Wolks", 4);
        
        lstAutomaticos.add(m1);
        lstAutomaticos.add(c1);
        
        for (IAutomatico a : lstAutomaticos) {
            a.mudaMarchaAutomatico();
        }
                
    }
}
