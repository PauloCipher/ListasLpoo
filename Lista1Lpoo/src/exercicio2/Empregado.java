package exercicio2;
public class Empregado extends Pessoa {
    double salario;

    public Empregado(double salario, String nome, int idade, double altura, String sexo) {
        super(nome, idade, altura, sexo);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
     public double obterLucro (){
        return salario;
    }
}
