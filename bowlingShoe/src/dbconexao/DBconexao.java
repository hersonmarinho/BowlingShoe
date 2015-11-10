/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author herson.nmarinho
 */
public class DBconexao {
    
    public static String status = "Falha ao conectar.";
    
    public DBconexao() {
    
    }
    
    public static java.sql.Connection getConexaoMySQL() { 
        Connection connection = null;
        
        try {
            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);
            
            String serverName = "localhost"; 
            String mydatabase = "mysql";
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase; 
            String username = "root";
            String password = "123456";
            
            connection = DriverManager.getConnection(url, username, password);
            
            if (connection != null) { 
                status = ("Conectado com sucesso."); 
            } else { 
                status = ("Não foi possivel realizar a conexão."); 
            }
            
            return connection;
        } catch (ClassNotFoundException e) {
            System.out.println("O driver expecificado nao foi encontrado."); 
            return null;
        } catch (SQLException e) { 
            System.out.println("Nao foi possivel conectar ao Banco de Dados."); 
            return null; 
        }
    }
    
    public static String statusConection() { 
        return status; 
    }
    
    public static boolean FecharConexao() { 
        try { 
            DBconexao.getConexaoMySQL().close(); 
            return true; 
        } catch (SQLException e) { 
            return false; 
        } 
    }
    
    public static java.sql.Connection ReiniciarConexao() { 
        FecharConexao(); 
        return DBconexao.getConexaoMySQL(); 
    }
}