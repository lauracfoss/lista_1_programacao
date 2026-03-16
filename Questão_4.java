package lista_1;

import java.util.Scanner;

public class Questão_4 {

	public static void main(String[] args) {
		
// Crie um programa que leia a iddade de uma pessoa e informe sua classe eleitoral
// não eleitor (menos de 16), eleitor obrigatório (18-65) e facultativo (16-17/65+)
		
		Scanner s = new Scanner(System.in);

// Pedir a idade do usuário
		
		System.out.println("Informe sua idade:");
		int idade = s.nextInt();
		
// Fazer o sistema analisar a idade e categorizar o usuário de acordo
		
		if ( idade < 16 ) {
			System.out.println("Você ainda não é apto para ser eleitor.");
			}
        if (idade >= 18 && idade <= 65) {
        	System.out.println("Você é eleitor obrigatório.");
        	}
        if (idade >= 16 && idade <= 17 ) {
        	System.out.println("Você é eleitor facultativo.");
        	}
        if (idade > 65 ) {
        	System.out.println("Você é eleitor facultativo.");
        	}
	}

}
