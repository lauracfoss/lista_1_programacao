package lista_1;

import java.util.Scanner;

public class Questão_6 {
	
	public static void main(String[] args) {
		
// Crie um programa que leia um numero inteiro entre 1 e 7 e informe o dia da semana correspondente.
// Se informar outro numero, imprimir que não há dia da semana associado.
		
		Scanner s = new Scanner(System.in);
		
// Pedir para informar o número
		
		System.out.println("Informe um número entre 1 e 7 e descubra a qual dia da semana ele está associado:");
		
// declarar a variávele mandar ler
		
		int dia = s.nextInt();
		
// Determinar o dia da semana relacionado ao numero escolhido		
		
		if (dia == 1) {
			System.out.println("O primeiro dia da semana é domingo.");
		}
		if (dia == 2) {
			System.out.println("O segundo dia da semana é segunda-feira.");
		}
		if (dia == 3) {
			System.out.println("O terceiro dia da semana é terça-feira.");
		}
		if (dia == 4) {
			System.out.println("O quarto dia da semana é quarta-feira.");
		}
		if (dia == 5) {
			System.out.println("O quinto dia da semana é quinta-feira.");
		}
		if (dia == 6) {
			System.out.println("O sexto dia da semana é sexta-feira.");
		}
		if (dia == 7) {
			System.out.println("O sétimo dia da semana é sábado.");
		}
		if (dia < 1 || dia > 7) {
			System.out.println("Este número não corresponde a nenhum dia da semana.");
		}
	}

}
