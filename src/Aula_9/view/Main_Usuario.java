package Aula_9.view;

import Aula_9.dao.UsuarioDAO;
import Aula_9.dao.UsuarioDAO_old;
import Aula_9.entity.Usuario;
import java.util.ArrayList;

public class Main_Usuario {
    public static void main(String[] args) {
        Usuario usu = new Usuario("carlos", "1111");
        UsuarioDAO dao = new UsuarioDAO();
        
        dao.inserir(usu);
    }
}
