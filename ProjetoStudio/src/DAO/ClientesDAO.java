/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import DTO.ClientesDTO;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author alex
 */
public class ClientesDAO {
    
    Connection objConn = null;
    
    public ResultSet cadastrarClientes(ClientesDTO objCliente){
        
        objConn = new ConexaoDB().conectarDB();
        
        String sql = "insert into cliente value ( default, ?, ?, ? )";
        
        try{
            PreparedStatement pst =  objConn.prepareStatement(sql);
            pst.setString(1, objCliente.getNome());
            pst.setInt(2, objCliente.getCpf());
            pst.setInt(3, objCliente.getNumCell());
            
            ResultSet objResult = pst.executeQuery();
            return objResult;
            
        } catch (SQLException erro){

            JOptionPane.showMessageDialog(null, "ClienteDAO: " + erro.getMessage());
            return null;
        }
        
        
    }
    
}
