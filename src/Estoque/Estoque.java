package Estoque;

import java.util.ArrayList;
import java.util.Scanner;




public class Estoque {
    
    ArrayList<String> ProdutosEstoque = new ArrayList<>();
    Scanner sc = new Scanner(System.in);


    public void MainEstoque() {
        System.out.println("Menu de estoque");
        System.out.println("[1] - Ver estoque ");
        System.out.println("[2] - Adicionar estoque ");
        System.out.println("[3] - Remover estoque ");

        int opc = sc.nextInt();
        if(opc == 1) {
            VerEstoque();
        } else if (opc == 2) {
            AdicionarEstoque();
        } else if (opc == 3) {
            RemoverEstoque();
        }
    }

    public void VerEstoque() {

        int tamanho = ProdutosEstoque.size();

        System.out.println("Visualizar produtos do estoque: ");
        for (int i = 0 ; i < tamanho; i++) {
            System.out.println(ProdutosEstoque);
        }

    }

    public void AdicionarEstoque() {

        System.out.println("Digite o nome do produto: ");
        String nomeProd = sc.nextLine();

        sc.nextLine();

        System.out.println("Qual a quantidade de produtos: ");
        double quantProdDouble = sc.nextDouble();

        String quantProd = Double.toString(quantProdDouble);

        ProdutosEstoque.add(nomeProd);
        ProdutosEstoque.add(quantProd);

        System.out.println("Item adicionado ao sistema!");

    }

    public void RemoverEstoque() {
        System.out.println("Digite o nome do produto a ser removido: ");
        String nome = sc.nextLine();

        System.out.println("Digite a quantidade de itens a remover: ");
        double quant1 = sc.nextDouble();
        String quant = Double.toString(quant1);

        ProdutosEstoque.remove(nome);
        ProdutosEstoque.remove(quant);
        System.out.println("Produto removido com sucesso!");
    }


}
