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
public class Sapato {
    
    private int id;
    private String nome;
    private int numero;
    private String status;
    
    public Sapato(){
        
    }
    
    public Sapato(int id, String nome, int numero, String status){
        this.id = id;
        this.nome = nome;
        this.numero = numero;
        this.status = status;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
