/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loginhash;

import com.mycompany.loginhash.dao.UsuarioDAO;
import com.mycompany.loginhash.database.ConnectionSQL;
import com.mycompany.loginhash.model.Usuario;

/**
 *
 * @author LUISHENRIQUEPEDROSOS
 */
public class LoginHash {

    public static void main(String[] args) {
       
     ConnectionSQL.conectar();
     
     //Usuario meuUser = new Usuario("email@mail", "senhaUsuario123");
     
     Usuario fulano = new Usuario("leo@mail.com", "12345");
    // Usuario fulano1 = new Usuario("Luis@email.com", "1214");
     
     UsuarioDAO usuarioDAO = new UsuarioDAO();
     // usuarioDAO.registrarUsuario(fulano);
     // usuarioDAO.registrarUsuario(fulano1);
     
     usuarioDAO.validarLogin(fulano);
    // System.out.println(
    // usuarioDAO.buscarUsuarioPorEmail("leo@mail.com").getEmail()
    // );
     
     //usuarioDAO.atualizarSenha("leo@mail.com","goiabada");
    }
}
