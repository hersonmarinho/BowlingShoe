/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowlingshoe;

/**
 *
 * @author herson.nmarinho
 */
public class Cliente {
    
    private String nome;
    private String email;
    private String cpf;
    private String rg;
    private String telefone;
    private String idade;
    
    public Cliente (String nome, String email, String cpf, String rg, String telefone, String idade){
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }

    
    public String getCpf() {
        return cpf;
    }

    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    public String getRg() {
        return rg;
    }

    
    public void setRg(String rg) {
        this.rg = rg;
    }

    
    public String getTelefone() {
        return telefone;
    }

    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
    public String getIdade() {
        return idade;
    }

    
    public void setIdade(String idade) {
        this.idade = idade;
    }
    
    
}
