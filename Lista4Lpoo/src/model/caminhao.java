/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author aluno
 */
public class caminhao extends Automovel{
    protected String modelo;

 public caminhao (String modelo, String marca, String cor, String kmRodado, String chassi) {
        super(cor, marca , kmRodado, chassi);
        this.modelo = modelo;
    }
    public caminhao() {
    }

    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
}