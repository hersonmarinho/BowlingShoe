/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconexao;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBconexao {

    private static final String banco = "jdbc:sqlite:/D:/Documents/GitHub/BowlingShoe/bowlingShoe/src/lib/bowlingShoe_db.db";
    private static final String drive = "org.sqlite.JDBC";
    public static Connection con = null;

    public DBconexao() {

    }

    public static Connection getDBconexao() {
        if (con == null) {
            try {
                Class.forName(drive);
                con = DriverManager.getConnection(banco);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Driver do Banco não encontrado!" + ex.getMessage());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Não foi possível conectar como banco" + ex.getMessage());
            }
        }
        return con;
    }

    public static PreparedStatement getPreparedStatement(String sql) {
        if (con == null) {
            con = getDBconexao();
        }
        try {
            return con.prepareStatement(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de SQL" + ex.getMessage());
        }
        return null;
    }

    public static void fecharConexao() {
        boolean result = true;
        try {
            con.close();
            JOptionPane.showMessageDialog(null, "CONEXÃO MAIS DO QUE ENCERRADA SEUS BABACAS");
        } catch (SQLException fecha) {
            result = false;
        }
    }
}
