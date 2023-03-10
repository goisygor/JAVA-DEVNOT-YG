package ExerciciosifElse;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Exercicios {
    Scanner sc = new Scanner (System.in);
    public void exercicio1 () {
        System.out.println("Digite o Valor1");
        int Valor1 = sc.nextInt();
        System.out.println("Digite o Valor2");
        int Valor2  = sc.nextInt();
        if ( Valor1>Valor2){
        System.out.println("O Maior Valor é"+Valor1);
    }

     else{
        System.out.println("O Maior Valor é"+Valor2);
     }
    
    }
    
    public void exercicio2 () {
        System.out.println("Digite o Ano de Nascimento");
        int Nascimento = sc.nextInt();
        if (Nascimento>=2007){
            System.out.println("Não Votará esse Ano");
        }
        else{
            System.out.println("Votará esse Ano");
        }

    }

    public void exercicio3 () {
       System.out.println("A Senha é");
       int Senha= sc.nextInt();
       if (Senha==1234){
        System.out.println("ACESSO PERMITIDO");
       }
       else{
        System.out.println("ACESSO NEGADO");
       }
        
    }

    public void exercicio4 () {
        System.out.println("Quantidade de maças");
        int quantidade = sc.nextInt();
        double valorDesconto = 0.0;
        if (quantidade == 0) {
            valorDesconto = 0.0;
        } else if (quantidade >= 12) {
            valorDesconto = 0.25;
        } else {
            valorDesconto = 0.30;
        }
        double valorTotalDesconto = (quantidade * valorDesconto);
        System.out.println("Valor da sua compra é" + valorTotalDesconto);
    }
{ 
    }

    public void exercicio5 () {
        System.out.println("Informe o Primeiro Valor");
        int n1 = sc.nextInt();
        System.out.println("Informe o Segundo Valor");
        int n2 = sc.nextInt();
        System.out.println("Informe o Terceiro Valor");
        int n3 = sc.nextInt();
        //n1<n2<n3
        if (n1<n2 && n2<n3){
            System.out.println("A Ordem Crescente é"+n1+","+n2+" "+n3+);
        

        }




        if (sexo == 1) { // caso seja feminino
            pesoIdeal = 62.1 * altura - 44.7;
        } else if (sexo == 2) { // caso seja masculino
            pesoIdeal = 72.7 * altura - 58;
        } else { // caso seja um valor inválido
            System.out.println("Valor de sexo inválido!");
            return; // encerra o programa
        }

        System.out.printf("Seu peso ideal é %.2f kg.", pesoIdeal);
    }
}



