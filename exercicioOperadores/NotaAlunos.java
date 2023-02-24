package exercicioOperadores;

import java.util.Scanner;

public class NotaAlunos {
    Scanner sc = new Scanner(System.in);
    public void notaFrequencia() {
        System.out.println("Informe a Nota 1 do aluno:");
        int nota1 = sc.nextInt();
        System.out.println("Informe a Nota 2 do Aluno:");
        int nota2 = sc.nextInt();
        double mediasAluno = (nota1+nota2)/2;
        System.out.println("A média do Aluno por Nota");
        boolean MediaAprovado = mediasAluno >= 50;
        System.out.println("O Aluno Esta Aprovado? "+MediaAprovado);
        System.out.println("informe A Frequencia Do Aluno:");
        int frequenciaAluno = sc.nextInt();
        boolean frequenciaAprovado = frequenciaAluno >= 75;
        System.out.println("O Aluno Esta Frequencia? "+frequenciaAprovado);
        boolean aprovacaoFinal = (MediaAprovado==true)&&(frequenciaAprovado==true);
        System.out.println("O Aluno Está Aprovado no Curso?"+aprovacaoFinal);
    }
    
}
