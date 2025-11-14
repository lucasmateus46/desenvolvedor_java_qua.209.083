package com.imc.models;

public class Imcc {
    private String nome;
    private double peso;
    private double altura;  
    private double imc;
    

    public Imcc() {
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getImc() {
        return this.imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }
    
    public double calcularImc() {
        return this.peso / (this.altura * this.altura);
    }

    public String classificarImc() {
        double imc = calcularImc();
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc >= 18.5 && imc < 24.9) {
            return "Peso normal";
        } else if (imc >= 25 && imc < 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }} 

        //Dicas finais
        public String dicasImc() {
            double imc = calcularImc();
            if (imc < 18.5) {
                return "Você a magro,mano.";
            } else if (imc >= 18.5 && imc < 24.9) {
                return "O seu peso é ideal.";
            } else if (imc >= 25 && imc < 29.9) {
                return "Cuidado,você ta acima do peso .";
            } else {
                return "Procure um medico.";
            }
        
    }


}
