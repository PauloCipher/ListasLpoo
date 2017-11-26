package exercicio2;
import javax.swing.JOptionPane;
public class FornecedorTeste {
    public static void main(String[] args) {
        
    int valorEmDivida = Integer.parseInt(JOptionPane.showInputDialog("Valor em Divida:"));
    int creditoMaximo = Integer.parseInt(JOptionPane.showInputDialog("Crédito Máximo: "));
    String nome = JOptionPane.showInputDialog ("Qual o nome:");
    int idade = Integer.parseInt (JOptionPane.showInputDialog ("Qual a idade: "));
    double altura = Double.parseDouble(JOptionPane.showInputDialog ("Qual a altura: "));
    String sexo = JOptionPane.showInputDialog ("Qual o sexo: ");
        int credito = 0;
    Fornecedor teste = new Fornecedor (valorEmDivida, creditoMaximo, credito, nome, idade, altura, sexo);
    
    teste.obterSaldo();
    
    JOptionPane.showMessageDialog(null, "Nome: " + nome +"\n" + "Sexo: "+ sexo +"\n" + "Idade: " + idade +"\n" + "Altura: " + altura +"\n" + "Crédito Maximo:" + creditoMaximo +"\n" + "Valor em Dívida:" + valorEmDivida +"\n" + "Crédito Disponível:" + credito);
 
    }
}
