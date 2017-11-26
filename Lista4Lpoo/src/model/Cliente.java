/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author aluno
 */
public class Cliente extends Pessoa{

    protected String cpf;

    public Cliente(String cpf, String nome, String altura, int idade) {
        super(nome, altura, idade);
        this.cpf = cpf;
    }

    public Cliente() {
    }
    

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    
}
