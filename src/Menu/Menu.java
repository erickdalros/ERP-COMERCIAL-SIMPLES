package Menu;

import java.util.Scanner;
import Util.LimparTerminal;
import Financeiro.Financeiro;
import Estoque.Estoque;
import Fiscal.GerarNF;

public class Menu {
    
    public boolean ativo; 

    Scanner sc =  new Scanner(System.in);
    LimparTerminal lt = new LimparTerminal();
    Financeiro financeiro = new Financeiro();
    Estoque estoque = new Estoque();
    GerarNF gerarNF =  new GerarNF();

    public void MainMenu(boolean ativo){

        while (ativo = true) {
            System.out.println("Bem vindo ao Sistema de ERP ");
            System.out.println("Opções ERP: ");
            System.out.println("[1] - Financeiro ");
            System.out.println("[2] - Estoque / almoxarifado");
            System.out.println("[3] - Fiscal e Tributos ");

            System.out.println("Digite o setor que deseja acessar: ");
            int opc = sc.nextInt();

            switch(opc) {
                case 1:
                    System.out.println("Acessando menu....");
                    lt.limpar();
                    financeiro.financeiro();
                    break;
                case 2:
                    System.out.println("Acessando menu....");
                    lt.limpar();
                    estoque.MainEstoque();
                    break;
                case 3:
                    System.out.println("Acessando menu....");
                    lt.limpar();
                    gerarNF.GerarNota();
                    break;
                default:
                    System.out.println("Nenhuma opção selecionada....");   
                    break;        
            }

        }

    }


}
