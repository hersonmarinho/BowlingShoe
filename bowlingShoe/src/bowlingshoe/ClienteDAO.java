/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowlingshoe;

import dbconexao.DBconexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author herson.nmarinho
 */
public class ClienteDAO {

    private DBconexao con;
    
    public ClienteDAO(DBconexao con){
        this.con = con;
    }

    public void InserirPessoa(Cliente pessoa) throws Exception {
        try {
            PreparedStatement ps = con.exect("INSERT INTO PESSOA (NOME) VALUES (?)");
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "DADOS SALVOS");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível conectar com o banco");
            
        }
        
    }

    public void InserirCliente(Cliente cliente) throws Exception {
        DBconexao conexao = new DBconexao();
        conexao.conecta();
        PreparedStatement inserir = (PreparedStatement) conexao.exec("INSERT INTO CLIENTE (CPF,IDADE,TELEFONE,RG) VALUES (?,?,?,?)");
        inserir.setString(1, cliente.getCpf());
        inserir.setInt(2, cliente.getIdade());
        inserir.setString(3, cliente.getTelefone());
        inserir.setString(4, cliente.getRg());
        inserir.executeUpdate();
        inserir.close();
        conexao.desconecta();
    }

}
