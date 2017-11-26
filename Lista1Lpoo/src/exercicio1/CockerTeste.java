package exercicio1;
import javax.swing.JOptionPane;
public class CockerTeste {
    public static void main(String[] args) {
        int opcao;
        boolean tosa = false;
        
        String cor = JOptionPane.showInputDialog("Qual é a cor do animal?");
        String tipo = JOptionPane.showInputDialog ("Qual é o tipo do animal?");
        String nome = JOptionPane.showInputDialog("Qual é o nome do animal?");
        String raca = JOptionPane.showInputDialog("Qual é a raça do animal?");
        opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - Precisa tosar o animal \n 2 - Não precisa tosar o animal"));
        switch (opcao) {
            case 1:
                tosa = true;
                break;
            case 2:
                tosa = false;
                break;
        }
        Cocker teste = new Cocker (tosa, cor, tipo, nome, raca);
        JOptionPane.showMessageDialog(null, "Cor "+ cor +"\n" +  "Tipo: "+ tipo +"\n" +  "Nome: "+ nome +"\n" + "Raça: "+ raca +"\n" +  "Precisa tosar? "+ tosa);       
    }
    
}