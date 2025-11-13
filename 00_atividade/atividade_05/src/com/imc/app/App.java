package com.imc.app;
import javax.swing.JOptionPane;
import com.imc.models.Imcc;
public class App {
    public static void main(String[] args) throws Exception {
    
        Imcc imc = new Imcc();
        String[] opcoes = {"Calcular IMC", "Sair"};
        Object escolha;
        do {
            escolha = JOptionPane.showInputDialog(null, "Escolha uma opção:", "Calculadora de IMC",
                    JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
            if (escolha == "Calcular IMC") {
                String nome = JOptionPane.showInputDialog("Digite seu nome:");
                double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso (kg):").replace(",", "."));
                double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura (m):").replace(",", "."));
                
                imc.setNome(nome);
                imc.setPeso(peso);
                imc.setAltura(altura);
                
                double valorImc = imc.calcularImc();
                String classificacao = imc.classificarImc();
                
                String mensagem = String.format("Nome: %s\nPeso: %.2f kg\nAltura: %.2f m\nIMC: %.2f\nClassificação: %s",
                        imc.getNome(), imc.getPeso(), imc.getAltura(), valorImc, classificacao , imc.dicasImc());
                
                JOptionPane.showMessageDialog(null, mensagem, "Resultado do IMC", JOptionPane.INFORMATION_MESSAGE);
                
                
            }

        } while (escolha != "Sair");
        
        
    }
}
