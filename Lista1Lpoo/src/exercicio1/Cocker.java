package exercicio1;
public class Cocker extends Cachorro {
    boolean tosa;

    public Cocker(boolean tosa, String nome, String raca, String tipo, String cor) {
        super(nome, raca, tipo, cor);
        this.tosa = tosa;
    }    
    public void setTosa(boolean tosa) {
        this.tosa = tosa;
    }
    public boolean PrecisaTosa (){
        return tosa;
    }
    
}
