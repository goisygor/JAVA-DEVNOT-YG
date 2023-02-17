package exercicioOperadores;

import java.util.Scanner;

public class NotaAlunos {
    Scanner sc = new Scanner(System.in);
    public void notaFrequencia() {
        System.out.println("Informe a Nota 1 do aluno:");
        int nota1 = sc.nextInt(90);
        System.out.println("Informe a Nota 2 do Aluno:");
        int nota2 = sc.nextInt(85);
        double mediasNotas = (nota1+nota2)/2;
        
    }
    
}
