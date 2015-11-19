/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowlingshoe;

/**
 *
 * @author hmarinho
 */
public class ItemDevolucao {
    
    private int idMovimentacao;
    private int idFuncionario;
    private String nomeCliente;
    private String cpfCliente;
    private int idSapato;
    private String nomeProduto;
    private int numeroProduto;
    private String dataRetirada;
    private String statusMovimentacao;
    
    public ItemDevolucao(int idMovimentacao, int idFuncionario, String nomeCliente, String cpfCliente, int idSapato, String nomeProduto, int numeroProduto, String dataRetirada, String statusMovimentacao){
        this.idMovimentacao = idMovimentacao;
        this.idFuncionario = idFuncionario;
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.idSapato = idSapato;
        this.nomeProduto = nomeProduto;
        this.numeroProduto = numeroProduto;
        this.dataRetirada = dataRetirada;
        this.statusMovimentacao = statusMovimentacao;
    }
        
    public ItemDevolucao(){
        
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public int getIdSapato() {
        return idSapato;
    }

    public void setIdSapato(int idSapato) {
        this.idSapato = idSapato;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getNumeroProduto() {
        return numeroProduto;
    }

    public void setNumeroProduto(int numeroProduto) {
        this.numeroProduto = numeroProduto;
    }

    public String getStatusMovimentacao() {
        return statusMovimentacao;
    }

    public void setStatusMovimentacao(String statusMovimentacao) {
        this.statusMovimentacao = statusMovimentacao;
    }

    public String getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(String dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public int getIdMovimentacao() {
        return idMovimentacao;
    }

    public void setIdMovimentacao(int idMovimentacao) {
        this.idMovimentacao = idMovimentacao;
    }
    
}
