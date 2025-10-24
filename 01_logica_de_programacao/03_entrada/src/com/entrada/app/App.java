package com.entrada.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     // instância do objeto leia
        Scanner leia = new Scanner(System.in);
        
        // delcaração de váriaveis 
        String nome;
        String email;
        int idade;
        double altura;

        // entrada de dados
        System.out.println("informe seu nome");
        nome = leia.nextLine();
        System.out.println("informe sua idade");
        idade = leia.nextInt();
        System.out.println("informe sua altura em metros");
        altura = leia.nextDouble();
        System.out.println("Informe seu email");
        email = leia.nextLine();

        // limpeza de buffer
        leia.nextLine();

        // saída de dados
        System.out.println("Nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Email: " + email);


        // fechar objteto close
        leia.close();
        

    }
}

