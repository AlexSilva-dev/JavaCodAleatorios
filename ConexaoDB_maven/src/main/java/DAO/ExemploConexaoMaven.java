/*
 * Para o uso dessa conexao precisa de add a dependencia no arquivo xml
 * Para achar os código dessas dependências basta pesquisar no google o nome da dependencia + maven
 */

package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alex
 */
public class ExemploConexaoMaven {

    public static void main(String[] args) {
        conectarDB();
    }
    
    
    public static Connection conectarDB(){
        
        String url = "jdbc:mysql://localhost:3306/ProjStudioDB";
        String user = "root";
        String senha = "12345678";
        Connection objConn = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("1");
            
            try
            {
                objConn = DriverManager.getConnection(url, user, senha);
                System.out.println("Deu certo");
            } catch (SQLException ex)
            {
                Logger.getLogger(ExemploConexaoMaven.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Erro 2 try");
                return null;
            }
            
            
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(ExemploConexaoMaven.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erro 1 try");
        }
        
        return objConn;
    }
}
