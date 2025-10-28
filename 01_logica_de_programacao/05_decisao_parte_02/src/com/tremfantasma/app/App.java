package com.tremfantasma.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       // instancia a classe Scanner
       Scanner leia = new Scanner(System.in);

       // declaração de variáveis
       String nome;
       int idade;
       double altura;


       //entrada de dados
       System.out.println("Informe seu nome,mano");
       nome = leia.nextLine();
       System.out.println("informe sua idade pivete");
       idade = leia.nextInt();
       System.out.println("Informe a altura em metros(la ele):");
       altura = leia.nextDouble();

       // estrutura de decisão
       if (idade >= 14 && altura >= 1.5)
        System.out.println(nome + " foi liberado.");
       else {
        System.out.println(nome + " não autorizado.");
    
       }

       // fecha objeto scanner;
       leia.close();

    }
}