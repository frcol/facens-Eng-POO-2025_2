package Aula_5;

import java.util.ArrayList;

public class Main_Lista {
    public static void main(String[] args) {
        ArrayList<String> lstNomes;
        lstNomes = new ArrayList<>();
        
        lstNomes.add("Fabio");
        lstNomes.add("Maria");
        lstNomes.add("Darth Vader");
        
        System.out.println(lstNomes.get(2));
        
        if (lstNomes.contains("Fabio")) {
            System.out.println("Essa lista tem um nome lindo dento dela!!!!");
        }
        
        if (lstNomes.isEmpty()) {
            System.out.println("A lista esta vazia...");
        }
        else {
            System.out.println("A lista tem elementos...");
        }
        
        for (int i=0; i < lstNomes.size(); i++) {
            System.out.println(lstNomes.get(i));
        }
        
        for (String s : lstNomes) {
            System.out.println(s);
        }
        
        lstNomes.remove("Maria");
        lstNomes.remove(0);
        
        System.out.println(lstNomes.size());
        
        lstNomes.clear();
    }
}
