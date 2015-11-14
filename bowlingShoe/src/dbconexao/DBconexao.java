/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author herson.nmarinho
 */
public class DBconexao {

    private Connection conexao;
    public Statement statement;
    public ResultSet resultset;
    public PreparedStatement prep;

    public void conecta() throws Exception {
        Class.forName("org.sqlite.JDBC");
        conexao
                = DriverManager.getConnection("jdbc:sqlite:/D:/Documents/GitHub/BowlingShoe/DB/bowlingShoe_db.db");
        statement = conexao.createStatement();
        conexao.setAutoCommit(false);
        conexao.setAutoCommit(true);

    }

    public ResultSet exec(String sql) throws Exception {
        return resultset = statement.executeQuery(sql);
    }
    
    public PreparedStatement exect(String sql) throws Exception {
        return prep = (PreparedStatement) prep.executeQuery(sql);
    }
    
    
    public void desconecta() {
        boolean result = true;
        try {
            conexao.close();
            JOptionPane.showMessageDialog(null, "banco fechado");
        } catch (SQLException fecha) {
            JOptionPane.showMessageDialog(null, "Não foi possivel "
                    + "fechar o banco de dados: " + fecha);
            result = false;
        }

    }


    
}
