package Financeiro;


public class OperacaoCaixa{
    
    SaldoCaixa sd = new SaldoCaixa();


    public void RemoveSaldoCaixa(double valorRemove) {
        
        double cx1 = sd.GetCaixa1();
        if(valorRemove > cx1) {
            System.out.println("o valor do caixa nao pode ser negativo...");
        } else {
            cx1 = cx1 - valorRemove;
            System.out.println("Valor registrado e subtraido do caixa!!");
        }
    }

    public void AdicionaSaldoCaixa(double valorRemove) {
        double cx1 = sd.GetCaixa1();
        cx1 = cx1 + valorRemove;
        System.out.println("Valor registrado e adicionado ao caixa!!");
    }

}

