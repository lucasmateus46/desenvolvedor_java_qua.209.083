package com.objeto.app;

import javax.swing.JOptionPane;

import com.objeto.models.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
     Pessoa usuario = new Pessoa();

     //entrada de dados
     usuario.setNome(JOptionPane.showInputDialog("Informe seu nome:"));
     usuario.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:")));
        usuario.setCpf(JOptionPane.showInputDialog("Informe seu CPF:"));
        usuario.setEmail(JOptionPane.showInputDialog("Informe seu email:"));
        usuario.setTelefone(JOptionPane.showInputDialog("Informe seu telefone:"));

        // saida de dados
        JOptionPane.showMessageDialog(
            null,
            "Dados do Usuário:\nNome: " + usuario.getNome()
             + "\nIdade: " + usuario.getIdade() +
            "\nCPF: " + usuario.getCpf() +
             "\nEmail: " + usuario.getEmail() +
              "\nTelefone: " + usuario.getTelefone()
        );

    }
}
