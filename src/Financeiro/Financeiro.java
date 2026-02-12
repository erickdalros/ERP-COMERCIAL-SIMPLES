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

        Menu menu = new Menu();

        System.out.println("[1] - Nova receira caixa ");
        System.out.println("[2] - Nova despesa caixa ");

        System.out.println("Escolha uma opção do Financeiro: ");

        int opc = sc.nextInt();
        if (opc  ==  1) {
            novaReceita();
        } else if (opc == 2) {
            novaDespesa();
        } else {
            System.out.println("Opção inválida");
            menu.MainMenu(true);
        }

    }

    private void novaReceita() {
        Menu menu = new Menu();
        
        System.out.println("Nova Receita: \n");

        System.out.println("Digite o valor da receita: ");
        double valorDouble = sc.nextDouble();
        String valor = Double.toString(valorDouble);

        sc.nextLine();

        System.out.println("Digite a descrição da receita: ");
        String desc = sc.nextLine();

        receita.add(desc);
        receita.add(valor);

        opcx.AdicionaSaldoCaixa(valorDouble);
        
        menu.MainMenu(true);
    }

    private void novaDespesa() {
        
        Menu menu = new Menu();

        System.out.println("Digite o valor da despesa: ");
        double valorDouble = sc.nextDouble();
        String valor = Double.toString(valorDouble);

        sc.nextLine();

        System.out.println("Digite a descrição da despesa: ");
        String desc = sc.nextLine();

        despesas.add(desc);
        despesas.add(valor);

        opcx.RemoveSaldoCaixa(valorDouble);

        menu.MainMenu(true);
    }


}
