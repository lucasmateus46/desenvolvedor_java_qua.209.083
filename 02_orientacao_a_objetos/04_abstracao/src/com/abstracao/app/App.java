package com.abstracao.app;

import java.util.Scanner;

import com.abstracao.models.Carro;
import com.abstracao.models.Moto;

public class App {
    public static void main(String[] args) throws Exception {
     // nstancia objeto de entrada de dados
     Scanner leia = new Scanner(System.in); 
      
     // instancia as classes
        Carro carro = new Carro();
        Moto moto = new Moto();

        // declaração de variaveis
        String combustivel;

        // entrada de dados
        System.out.println("informe os dados do carro:");
        System.out.println("informe o fabricante:");
        carro.fabricante = leia.nextLine();
        System.out.println("informe o modelo:");
        carro.modelo = leia.nextLine();
        System.out.println("informe a cor:");
        carro.cor = leia.nextLine();
        System.out.println("informe a placa:");
        carro.placa = leia.nextLine();

        //padrão de combustivel
        carro.motorDiesel = false;
        carro.motorEletrico = false;    
        carro.motorFlex = false;
        carro.motorGasolina = false;
        carro.motorEtanol = false;

        // usuario escolhe o combustivel
        System.out.println("\nInforme o tipo de combustivel:\n");
        System.out.println("1 - Gasolina");
        System.out.println("2 - Etanol");
        System.out.println("3 - Tanto gasolina como etanol");  
        System.out.println("4 - Diesel");  
        System.out.println("4 - Diesel");  
        System.out.println("5 - Eletrico");  
        combustivel = leia.nextLine();
        switch (combustivel) {
            case "1":
                carro.motorGasolina = true;
                break;
            case "2":
                carro.motorEtanol = true;
                break;
            case "3":
                carro.motorFlex = true;
                break;
            case "4":
                carro.motorDiesel = true;
                break;
            case "5":
                carro.motorEletrico = true;
                break;    
            default:
                System.out.println("Combustivel Não Compatível");
                break;
        }

        //entrada de dados da moto
        System.out.println("\ninforme os dados da moto:");
        System.out.println("informe o fabricante:");
        moto.fabricante = leia.nextLine();
        System.out.println("informe o modelo:");
        moto.modelo = leia.nextLine();
        System.out.println("informe a cor:");
        moto.cor = leia.nextLine();
        System.out.println("informe a ano:");
        moto.ano = leia.nextLine();
        System.out.println("informe a placa:");
        moto.placa = leia.nextLine();

        // saida de dados
        System.out.println("\nDados do Carro:");
        carro.exibirDados();
        System.out.println("\nDados do Moto:");
        moto.exibirDados();



        // fecha objeto leia
        leia.close();
    }
}
