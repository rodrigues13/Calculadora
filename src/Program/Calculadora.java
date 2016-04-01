package Program;

import java.util.Scanner;

public class Calculadora {
//Calculadora que calcula soma, subtração, multolicação e divisão.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Menu da calculadora
        double escolha = 0;
        while (escolha != 5) {
            System.out.println("---->CALCULADORA<----");
            System.out.println("=====================");
            //opções que o usuario tera para escolher
            System.out.println("1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n5 - Sair");
            escolha = input.nextDouble();

            if (escolha == 1) {
                soma();//aqui estou chamando meu metodo soma
            } else if (escolha == 2) {
                subtração();//aqui estou chamdno meu metodo subtração
            } else if (escolha == 3) {
                multiplicação();//aqui estou chamando meu metodo multiplicação
            } else if (escolha == 4) {
                divisão();//aqui estou chamando meu metodo divisão
            }
        }

    }

    public static void soma() {
        Scanner input = new Scanner(System.in);

        System.out.println("---->Calculo soma<----");
        System.out.println("===============================");
        System.out.println("Informe quantidade de Nº a serem somados:");
        double qtd = input.nextDouble();/*Aqui o usuario inforna quantas veses 
        o programa ira fazer a soma
         */

        double resultado = 0;

        for (int i = 0; i < qtd; i++) {
            System.out.println("Informe Nº:");//Esse "print" irar se repetir o Nº de veses em que o usuario informo
            double entrada = input.nextDouble();

            resultado = entrada + resultado;//soma de todos os Nº digitados

        }
        System.out.println("Resultado da soma é:" + resultado);//resutados da soma
    }

    public static void subtração() {
        Scanner input = new Scanner(System.in);
        System.out.println("---->Calculo subtração<----");
        System.out.println("===========================");
        System.out.println("Informe quantidade de Nº a serem subtraidos:");
        double qtd = input.nextDouble();//aqui o usuario informa quantas veses o programa riar subtrair

        double resultado = 0;

        for (int i = 0; i < qtd; i++) {
            System.out.println("Informe Nº:");
            double entrada = input.nextDouble();//aqui e a entrada dos numerais

            resultado = entrada - resultado;//aqui e a subtração de todos os numeros informados pelo o usuario

        }
        System.out.println("Resultado da subtração é:" + resultado);//meu resultado

    }

    public static void multiplicação() {
        Scanner input = new Scanner(System.in);
        System.out.println("---->Calculo multiplicação<----");
        System.out.println("===============================");
        System.out.println("Informe quantidade de Nº a serem multiplicados:");
        double qtd = input.nextDouble();

        double resultado = 1;

        for (int i = 0; i < qtd; i++) {
            System.out.println("Informe Nº:");
            double entrada = input.nextDouble();

            resultado = entrada * resultado;

        }
        System.out.println("Resultado da multiplicação é:" + resultado);
    }

    public static void divisão() {
        Scanner input = new Scanner(System.in);
        System.out.println("---->Calculo divisão<----");
        System.out.println("=========================");
        System.out.println("Informe quantidade de Nº a serem divididos:");
        double qtd = input.nextDouble();

        double resultado = 0;

        for (int i = 0; i < qtd; i++) {
            System.out.println("Informe Nº:");
            double entrada = input.nextDouble();

            resultado = entrada * resultado;

        }
        System.out.println("Resultado da divisão é:" + resultado);

    }

}
