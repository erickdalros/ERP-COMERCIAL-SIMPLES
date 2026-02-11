package Menu;

import java.util.Scanner;
import Util.LimparTerminal;
import Financeiro.Financeiro;

public class Menu {
    
    public boolean ativo; 

    Scanner sc =  new Scanner(System.in);
    LimparTerminal lt = new LimparTerminal();
    Financeiro financeiro = new Financeiro();

    public void MainMenu(boolean ativo){

        while (ativo = true) {
            System.out.println("Bem vindo ao Sistema de ERP ");
            System.out.println("Opções ERP: ");
            System.out.println("[1] - Financeiro ");
            System.out.println("[2] - Contábilidade ");
            System.out.println("[3] - Estoque / almoxarifado");
            System.out.println("[4] - CRM ");
            System.out.println("[5] - Recursos Humanos ");
            System.out.println("[6] - Consórcio ");
            System.out.println("[7] - Fiscal e Tributos ");

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
                    break;
                case 3:
                    System.out.println("Acessando menu....");
                    break;
                case 4:
                    System.out.println("Acessando menu....");
                    break;
                case 5:
                    System.out.println("Acessando menu....");
                    break;
                case 6:
                    System.out.println("Acessando menu....");
                    break;
                case 7:
                    System.out.println("Acessando menu....");
                    break;
                default:
                    System.out.println("Nenhuma opção selecionada....");   
                    break;        
            }

        }

    }


}
