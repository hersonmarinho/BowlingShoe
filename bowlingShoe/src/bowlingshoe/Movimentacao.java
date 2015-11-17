/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowlingshoe;

/**
 *
 * @author Herson
 */
public class Movimentacao {
    
    private int idMov;
    private int idFun;
    private String cpfCliente;
    private int idSap;
    private String data;
    private String status;
    private Cliente cliente;
    private Sapato sapato;
    
    
    public Movimentacao(){
        
    }
    
    
    public Movimentacao(int idFun, String cpfCliente, int idSap, String data, String status){
        this.idFun = idFun;
        this.cpfCliente = cpfCliente;
        this.idSap = idSap;
        this.data = data;
        this.status = status;
    }

    public int getIdFun() {
        return idFun;
    }

    public void setIdFun(int idFun) {
        this.idFun = idFun;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public int getIdSap() {
        return idSap;
    }

    public void setIdSap(int idSap) {
        this.idSap = idSap;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Sapato getSapato() {
        return sapato;
    }

    public void setSapato(Sapato sapato) {
        this.sapato = sapato;
    }
}
