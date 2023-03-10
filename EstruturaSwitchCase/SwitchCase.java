package EstruturaSwitchCase;

import java.util.Scanner;

public class SwitchCase {
Scanner sc = new Scanner(System.in);
public void letras() {
    System.out.println("Digite uma Letra");
    String letra = sc.nextLine();
    switch( letra ){
        case "a": System.out.println(letra+" é vogal");
        break;
        case "e": System.out.println(letra+" é vogal");
        break;
        case "i": System.out.println(letra+" é vogal");
        break;
        case "o": System.out.println(letra+" é vogal");
        break;
        case "u": System.out.println(letra+" é vogal");
        break;
        default:
        System.out.println(letra+"é consoante");
    }
}

public void mes() {
    System.out.println("Digite o Numero");
    int Numero = sc.nextInt();
    switch ( Numero){
        case 1: System.out.println(Numero+" Mês de Janeiro ");
        break;
        case 2: System.out.println(Numero+" Mês de Fevereiro ");
        break;
        case 3: System.out.println(Numero+" Mês de Março ");
        break;
        case 4: System.out.println(Numero+" Mês deAbril ");
        break;
        case 5: System.out.println(Numero+" Mês de Maio ");
        break;
        case 6: System.out.println(Numero+" Mês de Junho ");
        break;
        case 7: System.out.println(Numero+" Mês de Julho ");
        break;
        case 8: System.out.println(Numero+" Mês de Agosto ");
        break;
        case 9: System.out.println(Numero+" Mês de Setembro ");
        break;
        case 10: System.out.println(Numero+" Mês de Outubro");
        break;
        case 11: System.out.println(Numero+" Mês de Novembro");
        break;
        case 12: System.out.println(Numero+" Mês de Dezembro");
        break;
        default: 
        System.out.println("Não Corresponde a Nenhum Mes");
        break;
    }
}
    
}
