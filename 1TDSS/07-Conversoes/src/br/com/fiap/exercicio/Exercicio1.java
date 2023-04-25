package br.com.fiap.exercicio;

import java.security.DomainCombiner;

import javax.swing.JOptionPane;

public class Exercicio1 {
	public static void main(String[] args) {
		
	
	//Ler os nomes, alturas e pesos
	String nome1 = JOptionPane.showInputDialog("Digite o nome da primeira pessoa");
	String nome2 = JOptionPane.showInputDialog("Digite o nome da segunda pessoa");
	double altura1 = Double.parseDouble(
			JOptionPane.showInputDialog("Informe a altura da primeira pessoa"));
	double altura2 = Double.parseDouble(
			JOptionPane.showInputDialog("Informe a altura da segunda pessoa"));	
	double peso1 = Double.parseDouble(
			JOptionPane.showInputDialog("Informe o peso da primeira pessoa"));
	double peso2 = Double.parseDouble(
			JOptionPane.showInputDialog("Informe o peso da segunda pessoa"));
	//Verificar a pessoa mais pesada e exibir o nome
	
	if (peso1 > peso2) {  
		JOptionPane.showMessageDialog(null, nome1 + " é a pessoa mais pesada");
	} else if (peso2 > peso1) {
		JOptionPane.showMessageDialog(null, nome2 + " é a pessoa mais pesada");
	} else {
		JOptionPane.showMessageDialog(null, "ambos possuem o mesmo peso");
	}
	//Verificar a pessoa mais alta e exibir o nome
	if (altura1 > altura2) {  
		JOptionPane.showMessageDialog(null, nome1 + " é a pessoa mais alta");
	} else if (altura2 > altura1) {
		JOptionPane.showMessageDialog(null, nome2 + " é a pessoa mais alta");
	} else {
		JOptionPane.showMessageDialog(null,"ambos possuem o mesmo tamanho");
	}//if
	
	}//main
}//class