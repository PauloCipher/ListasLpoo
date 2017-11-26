package model;

public class Pessoa {
    protected String nome;
    protected String altura;
    protected int idade;
   

    public Pessoa(String nome, String altura, int idade) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
        
    }

    public Pessoa() {
    }
    
    
    public String getNome()
    {
        
        return  nome; 
    }
    
    public String getaltura()
    {
        return altura;
    }
    
    public int getidade()
    {
        return idade;
    }
             
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public void setAltura(String altura)
    {
        this.altura = altura;
    }
     public void setIdade(int idade)
    {
        this.idade = idade;
    }
     
}
