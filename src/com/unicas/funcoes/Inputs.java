package com.unicas.funcoes;

import javax.swing.JOptionPane;

public class Inputs {
	public static void main(String[] args) {
	String nome = JOptionPane.showInputDialog("Qual o seu nome");
	int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade"));
	double peso = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu peso"));
	
	System.out.println("O nome é: " + nome);
	System.out.println("A idade é: " + idade);
	System.out.println("O peso: " + peso);
	}
}
