package Aula_10;

import javax.swing.JOptionPane;

public class Main_Joption {
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "Testando janela");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade?"));
        JOptionPane.showMessageDialog(null, idade);
    }
}
