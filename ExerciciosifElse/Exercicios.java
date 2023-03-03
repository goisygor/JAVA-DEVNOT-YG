package ExerciciosifElse;

import java.util.Scanner;

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
        System.out.println("Quantidade de Maça");
        int Quantidade= sc.nextInt();
        double valorMaça = 0.00;
       //double valorMaça2 = 0.30;
        //double valorCompra = Quantidade*valorMaça;
        //double valorCompra2 = Quantidade*valorMaça2;
        if (Quantidade==0.00);{
            valorMaça=0.00;}

        else if(Quantidade<=12){
        valorMaça=0.25;
    }
    else{
        valorMaça=0.30;
    }
       // if(Quantidade<=12);
        System.out.println("O Valor da Sua Compra é");
       // double valorMaça = 0.25;
     //   double valorMaça2 = 0.30;
        double valorCompra = Quantidade*valorMaça;
        //double valorCompra2 = Quantidade*valorMaça2;
    }
{ 
    }

    public void exercicio5 () {

    }

    public void exercicio6 () {

    }
    
}
