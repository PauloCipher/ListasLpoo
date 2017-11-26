package exercicio2;
public class Fornecedor extends Pessoa{
    int valorEmDivida;
    int creditoMaximo;
    int credito;

    public Fornecedor(int valorEmDivida, int creditoMaximo, int credito, String nome, int idade, double altura, String sexo) {
        super(nome, idade, altura, sexo);
        this.valorEmDivida = valorEmDivida;
        this.creditoMaximo = creditoMaximo;
        this.credito = credito;
    }  
    
    public int obterSaldo (){
        credito = creditoMaximo - valorEmDivida;
        return credito;
    }
    
}
