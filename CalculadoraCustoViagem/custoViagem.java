package CalculadoraCustoViagem;

/**
 * custoViagem
 */
public class custoViagem {

    public static void main(String[] args) {
        // obter valor do combustivel//
        double valorCombustivel = 4.99;
        // obter quilometragem por litro//
        double quilometragemLitro = 13;
        // obter quilometragem total//
        double quilometragemTotal = 680.50;
        // dividir quilometragem total por quilometragem por litro//
        double litrosGasto = quilometragemTotal / quilometragemLitro;
        // valor gasto//
        double valorGasto = litrosGasto * valorCombustivel;
        System.out.println("o valor gasto da viagem total foi de:");
        System.out.println(valorGasto);
    }

}