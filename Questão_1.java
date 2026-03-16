package lista_1;

import java.util.Scanner;

public class Questão_1 {

	public static void main(String[] args) {
		//Escreva um programa que leia um número e informe se ele é divisível por 10, por 5 ou por 2,
		//ou se não é divisível por nenhum deles.
		Scanner s = new Scanner (System.in);
		System.out.println("Informe um valor pertencente a classe dos números inteiros e descubra se ele é divisível por 10, por 5, por 2 ou se não é divisível por nenhuma das alternativas:");
		int v1 = s.nextInt();
		 
		if (v1 % 10 == 0) {
		  System.out.println("O número inteiro " + v1 + " é divisível por 10");
	}	if (v1 % 5 == 0) {
	      System.out.println("O número inteiro " + v1 + " é divisível por 5");
	}   if (v1 % 2 == 0) {
		  System.out.println("O número inteiro " + v1 + " é divisível por 2");  
	} 
	else {
		System.out.println ("O número não é divisível por nenhuma das opções");
	}
	 

	}

}
