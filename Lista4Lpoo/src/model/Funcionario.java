/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class  Funcionario extends Pessoa {

    private String matricula;

    public Funcionario(String nome, int idade, String altura, String matricula) {
        
        super(nome, altura, idade);
        this.matricula = matricula;

    }

    public Funcionario() {
    }
    

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
}

