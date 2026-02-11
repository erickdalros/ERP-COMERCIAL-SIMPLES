package Financeiro;

import java.util.Scanner;
import java.util.ArrayList;
import Menu.Menu;



public class Financeiro{
    
    Scanner sc = new Scanner(System.in);
    OperacaoCaixa opcx = new OperacaoCaixa();


    ArrayList<String> receita = new ArrayList<>();
    ArrayList<String> despesas = new ArrayList<>();

    public void financeiro() {

        System.out.println("[1] - Nova receira caixa \n");
        System.out.println("[2] - Nova despesa caixa \n");
        System.out.println("[3] - Ver saldo caixa \n");
        System.out.println("[4] - Extrato bancário \n");
        System.out.println("Escolha uma opção do Financeiro: ");

        int opc = sc.nextInt();
        if (opc  ==  1) {
            novaReceita();
        } else if (opc == 2) {
            novaDespesa();
        } else if (opc == 3) {
            fecharCaixa();
            System.out.println("Em desenvolvimento");
        }else if (opc == 4) {
            Extrato();
        } else {

        }

    }

    private void novaReceita() {
        Menu menu = new Menu();
        
        System.out.println("Nova Receita: \n");
        System.out.println("Digite a descrição da receita: ");
        String desc = sc.nextLine();
        sc.nextLine();
        System.out.println("Digite o valor da receita: ");
        double valorDouble = sc.nextDouble();
        String valor = Double.toString(valorDouble);
        receita.add(desc);
        receita.add(valor);

        opcx.AdicionaSaldoCaixa(valorDouble);
        
        menu.MainMenu(true);
    }

    private void novaDespesa() {
        Menu menu = new Menu();
        System.out.println("Digite a descrição da despesa: ");
        String desc = sc.nextLine();

        System.out.println("Digite o valor da despesa: ");
        double valorDouble = sc.nextDouble();
        String valor = Double.toString(valorDouble);

        despesas.add(desc);
        despesas.add(valor);

       opcx.RemoveSaldoCaixa(valorDouble);

       menu.MainMenu(true);
    }

    private void fecharCaixa() {
        Menu menu = new Menu();
        menu.MainMenu(true);
    }

    private void Extrato() {
        Menu menu = new Menu();
        System.out.println("Qual conta deseja ver?\n ");
        System.out.println("[1] - Receita \n");
        System.out.println("[1] - Despesa \n");
        System.out.println("Escolha: ");

        int opc = sc.nextInt();
        if (opc == 1){
            System.out.println("Colocar aqui a Lista de receitas");
        } else {
            System.out.println("Colocar aqui a Lista das despesas");
        }

        menu.MainMenu(true);
    }


}
