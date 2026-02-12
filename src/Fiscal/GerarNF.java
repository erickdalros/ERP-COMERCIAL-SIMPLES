package Fiscal;

import org.json.JSONObject;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class GerarNF {
    
    JSONObject nf = new JSONObject();
    Scanner sc =  new Scanner(System.in);

    public void GerarNota() {

        String data = DataHoje();

        /* Variáveis do Emitente e Destinatário */
        String RazaoSocial, Endereco, RazaoSocialDest, EnderecoDest, Email, NomeProduto, CpfCnpjEmitente, CpfCnpjDestino;
        int  Quantidade;
        float valor;

        System.out.println("Emissão da NF-e");
        System.out.println("=== EMITENTE ===");
        System.out.println("Digite a Razão Social: ");
        RazaoSocial = sc.nextLine();

        System.out.println("Digite o endereço: ");
        Endereco = sc.nextLine();

        System.out.println("CPF ou CNPJ: ");
        CpfCnpjEmitente = sc.nextLine();


        System.out.println("=== DESTINATÁRIO ===");
        System.out.println("Digite a Razão Social: ");
        RazaoSocialDest = sc.nextLine();

        System.out.println("Endereço: ");
        EnderecoDest = sc.nextLine();

        System.out.println("Email: ");
        Email = sc.nextLine();

        System.out.println("CPF ou CNPJ: ");
        CpfCnpjDestino = sc.nextLine();

        System.out.println("=== DADOS NOTA ===");
        System.out.println("Valor da nota: ");
        valor = sc.nextFloat();

        sc.nextLine();
        
        System.out.println("Nome da mercadoria: ");
        NomeProduto = sc.nextLine();

        System.out.println("Quantidade: ");
        Quantidade = sc.nextInt();

        System.out.println("Emissão de nota confirmada.....");


        /*Preencher os dados no json */
        nf.put("Geração de NF-e", "Nota Fiscal Eletrônica");
        nf.put("Data", data);
        nf.put("Razao Social", RazaoSocial);
        nf.put("Endereço", Endereco);
        nf.put("CPF / CNPJ", CpfCnpjEmitente);
        nf.put("Razao Social", RazaoSocialDest);
        nf.put("Endereço", EnderecoDest);
        nf.put("Email", Email);
        nf.put("CPF / CNPJ", CpfCnpjDestino);
        nf.put("Valor Nota", valor);
        nf.put("Nome da Mercadoria", NomeProduto);
        nf.put("Quantidade", Quantidade);


        /* Converter Json em String  e mostrando no terminal */
        String jsonStringExibe = nf.toString();
        System.out.println("Nota abaixo:");
        System.out.println(jsonStringExibe);


        /* Criando o arquivo .json */
        try ( FileWriter file = new FileWriter("ERP-COMERCIAL-SIMPLES\\src\\Fiscal\\nota.json")) {
            file.write(nf.toString());
            System.out.println("Arquivo gerado com sucesso com nome de nota.json");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private String DataHoje() {
        LocalDate hoje = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String data = hoje.format(formato);
        return data;
    }

}
