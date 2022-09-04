/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import DTO.UsuarioDTO;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author alex
 */
public class UsuarioDAO {

    Connection objConn = null;

    public ResultSet autenticacao(UsuarioDTO objUsuario) {

        objConn = new ConexaoDB().conectarDB();

        try{
            
            // a String slq é onde vou por os comandos do MySQL
            String sql = "select * from usuario "
                    + "where usuario = ? and senha = ?";    
            PreparedStatement pst = objConn.prepareStatement(sql);  // a classe PreparedStatement ira prepara o comando para ser executado no banco de dados
            pst.setString(1, objUsuario.getUsuario());      // Coloca o argumento correspondente nos ? na String slq, o 1 se refere a qual ? substituir
            pst.setString(2, objUsuario.getPassword());     // Substitui no segundo ?
            
            ResultSet objResul = pst.executeQuery();       // .executeQuery() - Executa o comando de fato
            return objResul;

        } catch (SQLException erro){
            JOptionPane.showMessageDialog(null,"UsuarioDAO " + erro.getMessage());
            return null;
            
        }

    }
}
