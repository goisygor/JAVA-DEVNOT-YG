package EstruturaDecisaoIf;

import java.util.Scanner;


public class EstruturaDecisaoIF {
    Scanner sc = new Scanner(System.in);

    /**
     * 
     */
    public void DecisaoIF(){
        System.out.println("Qual é o Preço do Produto");
        double precoProduto = sc.nextDouble();
        boolean produtoAltoValor = precoProduto >= 100 && precoProduto <200;
        double percentualDesconto = 0.0;
        if (produtoAltoValor) {// Estrutura de decisão if
            // Desconto para produtos de alto valor.
            percentualDesconto = 5.0;
        }
        
        boolean produtoAltoValor2 = precoProduto >=200;
        double percentualDesconto2 = 0.0;   
        if (produtoAltoValor2) {// Estrutura de decisão if
            // Desconto para produtos de alto valor.
            percentualDesconto = 10.0;
        }
        // Regra de Três 
    double desconto = (precoProduto * percentualDesconto) / 100;
    double precoComDesconto = precoProduto - desconto;
    System.out.println("O produto sairá por R$" + precoComDesconto);
    
        
}
public void DecisaoifElse() {
    System.out.println("Digite o Preço Do Produto");
    double precoProduto = sc.nextDouble();
    double percentualDesconto = 0.0;
    if(precoProduto<100){
        percentualDesconto = 0.0;
    } else if(precoProduto >=100 && precoProduto <200) {
        percentualDesconto = 5.0;
    } else if (precoProduto >=200 && precoProduto < 300){
        percentualDesconto = 10.0;
    }else{
        percentualDesconto = 15.0;
    }
    // Regra de Três 
    double desconto = (precoProduto * percentualDesconto) / 100;
    double precoComDesconto = precoProduto - desconto;
    System.out.println("O produto sairá por R$" + precoComDesconto);
}

}

