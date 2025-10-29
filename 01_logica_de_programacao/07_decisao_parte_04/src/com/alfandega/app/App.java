package com.alfandega.app;

import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
        // instancia a aclasse Scanner
        java.util.Scanner leia = new Scanner(System.in);

        // declaração de variáveis
        String nome;
        String resultado;
        double valor;


        // entrada de dados
        System.out.println(" Informe o nome do passageiro.");
        nome=leia.nextLine();
        System.out.println( " Informe o valor da passagem.");
        valor=leia.nextDouble();

        // verifica o valor
        resultado =(valor <= 1000) ? " - isento de alfandega." : " - sujeito a alfandega.";

        // mostra resulados
    System.out.println(nome + resultado);



        // fehca objeto leia
        leia.close();

    }
}
