package model;

public class Automovel 
{
    protected String cor;
    protected String marca;
    protected String kmRodado;
    protected String chassi;

    public Automovel() {
    }
    
    public Automovel (String cor, String marca, String kmRodado, String chassi){
        this.cor = cor;
        this.marca = marca;
        this.kmRodado = kmRodado;
        this.chassi = chassi;
    }
    
    public String getcor()
    {
        
        return cor;
    }
     
    public String getMarca()
    {
        
        return marca;
    }
    public String getKmRodado()
    {
        
        return kmRodado;
    }
    
    public void setCor(String cor)
    {
        this.cor = cor;
    }
    
     public void setMarca(String marca)
    {
        this.marca = marca;
    }
     
     public void setkmRodado(String kmRodado)
     {
         this.kmRodado = kmRodado;
     }
     
     public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
}
