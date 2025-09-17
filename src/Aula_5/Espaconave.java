package Aula_5;

import java.util.ArrayList;

public class Espaconave {
    private String nome;
    private ArrayList<Arma> lstArmas = new ArrayList<>();
    
    public void addArma(Arma arma) {
        lstArmas.add(arma);
    }
    
    public void addArma(String nome, String efeito, int dano) {
        Arma arma = new Arma(nome, dano, efeito);
        lstArmas.add(arma);
    }
    
    public void remove(Arma arma) {
        lstArmas.remove(arma);
    }
    
    public void remove(String nome) {
        for (int i=0; i < lstArmas.size(); i++) {
            if (lstArmas.get(i).getNome() == nome) {
                lstArmas.remove(i);
            }
        }
    }
    
    public void atira(String nome) {
        for (Arma a : lstArmas) {
            if (a.getNome().equals(nome)) {
                a.atira();
            }
        }
    }
    
    public void atiraTodos() {
        for(Arma a:lstArmas) {
            a.atira();
        }
    }
    
    public void listarArmas() {
        for(Arma arma:lstArmas) {
            arma.print();
        }
    }
}
 