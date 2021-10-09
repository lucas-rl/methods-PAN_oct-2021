package com.unicas.funcoes;

import javax.swing.JOptionPane;

public class Funcao6 {
	public static void main(String[] args) {
		//obter idade
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade"));
		
		if(idade < 18) {
			System.out.println("Menor de idade");
			System.out.println("Ano que vem será maior");
		}
		else{
			System.out.println("Maior");
		}
		
		
	}
}
