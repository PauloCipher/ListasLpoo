package view;

import controller.GerarAluguel;
import java.util.Scanner;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.*;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resposta;
        do {
            System.out.println("Escolha uma opção: \n"
                    + "1 - Cadastrar Pessoa \n"
                    + "2 - Cadastrar Automóvel \n"
                    + "3 - Criar Aluguel \n"
                    + "4 - Sair");

            resposta = sc.nextInt();
            ArrayList<Pessoa> pessoas = new ArrayList();
            ArrayList<Automovel> automoveis = new ArrayList();
            ArrayList<AluguelAutomovel> alugueis = new ArrayList();

            switch (resposta) {
                case 1:
                    System.out.println("Selecione:\n" + "1-Cliente \n" + "2-Funcionario");
                    int opcao = sc.nextInt();
                    if (opcao == 1) {
                        Cliente c1 = new Cliente();
                        c1.setNome(JOptionPane.showInputDialog(null, "Nome: "));
                        c1.setAltura(JOptionPane.showInputDialog(null, "Altura: "));
                        c1.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Idade: ")));
                        c1.setCpf(JOptionPane.showInputDialog(null, "Cpf: "));
                        pessoas.add(c1);
                        JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
                        break;
                    } else if (opcao == 2) {
                        Funcionario f1 = new Funcionario();
                        f1.setNome(JOptionPane.showInputDialog(null, "Nome: "));
                        f1.setAltura(JOptionPane.showInputDialog(null, "Altura: "));
                        f1.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Idade: ")));
                        f1.setMatricula(JOptionPane.showInputDialog(null, "Matricula: "));
                        pessoas.add(f1);
                        JOptionPane.showMessageDialog(null, "Funcionario cadastrado com sucesso!");
                        break;
                    }
                case 2:
                    System.out.println("Selecione:\n1-Carro\n" +"2-Caminhão\n");
                    int scan = sc.nextInt();
                    if (scan == 1) {
                        Automovel au1 = new Carro();
                        au1.setCor(JOptionPane.showInputDialog(null, "Cor: "));
                        au1.setMarca(JOptionPane.showInputDialog(null, "Marca: "));
                        au1.setkmRodado(JOptionPane.showInputDialog(null, "Km Rodado: "));
                        au1.setChassi(JOptionPane.showInputDialog(null, "Chassi: "));
                        automoveis.add(au1);
                        JOptionPane.showMessageDialog(null, "Carro cadastrado com sucesso!");
                        break;
                    } else if (scan == 2) {
                        Automovel au2 = new caminhao();
                        au2.setCor(JOptionPane.showInputDialog(null, "Cor: "));
                        au2.setMarca(JOptionPane.showInputDialog(null, "Marca: "));
                        au2.setkmRodado(JOptionPane.showInputDialog(null, "Km Rodado: "));
                        au2.setChassi(JOptionPane.showInputDialog(null, "Chassi: "));
                        automoveis.add(au2);
                        JOptionPane.showMessageDialog(null, "Caminhao cadastrado com sucesso!");
                        break;
                    }

                case 3:

                    GerarAluguel ga = new GerarAluguel();
                    System.out.println("Tipo:\n1-Diario\n2-Mensal");
                    
                    int tipoAl = sc.nextInt();
                    Cliente c11 = new Cliente();
                    pessoas.get(0);
                    Automovel au11 = new Automovel();
                    ga.calcularAluguel(c11, au11, tipoAl);
                    
                    break;
            }
        } while (resposta != 4);
    }
}