package Aula_7;


public class Main_Conta {

    public static void main(String[] args) {
        Pessoa p = new Pessoa("Fabio");
        ContaComum c = new ContaComum("poupan�a");
        
        p.addConta(c);
        
        p = null;
    }

}
