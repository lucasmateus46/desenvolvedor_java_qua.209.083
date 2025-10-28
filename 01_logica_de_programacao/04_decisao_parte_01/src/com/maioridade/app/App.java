package com.maioridade.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       // instancia a classe scanner
       Scanner leia = new Scanner(System.in);

       // delclaracao de variaveis 
       String nome;
       int idade;
       
       //entrada de dados
       System.out.println("informe seu nome");
       nome = leia.nextLine();
       System.out.println("informe a idade");
       idade = leia.nextInt();

       // estrutura de decisão
       if( idade >= 18){
        System.out.println(nome + " é maior de idade");
       } else {
        System.out.println(nome + " é menor de idade");
       }
        
       
       // fecha objeto leia
       leia.close();

    }
}
