package com.novacalculadora.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //instaciao Scanner
        Scanner leia = new Scanner (System.in);

        // declaração das variaveis
        double x;
        double y;
        double resultado = 0.0;
        int opcao = 0;
        String operacao;

        //  FIXME: loop
        do{
            // menu
            System.out.println("1 - soma: ");
            System.out.println("2 - subtração: ");
            System.out.println("3 - multiplicação: ");
            System.out.println("4 - divisão ");
            System.out.println("5 - resto a divisão: ");
            System.out.println("6 - potencia: ");
            System.out.println("7 - sair do programa: ");
            System.out.println("informe a opção desejada: ");
            operacao = leia.nextLine();

            if (operacao != "7"){
                // entrada de dados
                System.out.println("Informe o primeiro valor de x: ");
                x = leia.nextDouble();
                System.out.println("Informe o primeiro valor de y: ");
                y = leia.nextDouble();

                switch (operacao) {
                    case "1":
                    resultado = x + y;
                     break;
                    case "2":
                    resultado = x - y;
                     break;
                    case "3":
                    resultado = x * y;
                     break;
                    case "4":
                    resultado = x / y;
                     break;
                    case "5":
                    resultado = x % y;
                     break;
                    case "6":
                    resultado = Math.pow(x,y);
                     break;
                    default:
                    System.out.println("Operador inválido!");
                     break;
                   
                     // mostra o resultado
                     
                    
                }System.out.println("O resultado da operação é: " + resultado);

            }
             else {
                opcao = Integer.parseInt(operacao);     
               
            }
            // limpeza de buffer
            leia.nextLine();
        } while(opcao != 7);



        // fechar objeto leia
        leia.close();
    }
}
