package lista_1;

import java.util.Scanner;

public class Questão_3 {

	public static void main(String[] args) {
// A CEF concederá um crédito especial com juros de 2% aos seus clientes  de acordo com o saldo
// médio do último ano.
// Fazer um programa que leia o saldo médio de um cliente e calcule o valor do crédito de acordo
// coma tabela da lista. No final, imprimir uma mensagem informando o saldo médio e o valor do 
// crédito.
		
		Scanner s = new Scanner(System.in);
		
// Pedira informação central
		
		System.out.println("Informe seu saldo médio para calcular seu crédito especial:");
		double saldo = s.nextDouble();
		
// calcular o crédito de acordo com o saldo médio
		// declarar as variáveis de soma, para poder usar nos ifs (condicionais)
		
		double soma1 = 0;
		double soma2 = 0;
		double soma3 = 0;
		double soma = 0;
		
// limitar os creditos de acordo com o valor do saldo médio e informar o valor do crédito e quanto há no total ao final
		
		if (saldo > 0 && saldo <= 500) {
			soma = saldo + 0;
			System.out.println(" O valor correspondente ao seu saldo médio não se qualifica para receber o crédito especial. ");
			}
		if (saldo > 500 && saldo <= 1000) {
			soma1 = saldo*0.3;
			soma2 = saldo + saldo*0.3;
			soma3 = soma2 - soma2*0.002;
			System.out.println("Você recebeu 30% de crédito especial em cima do seu valor de saldo médio.");
			System.out.println("Total do crédito especial: R$" + soma1);
			System.out.println("Seu total é: R$" + soma2);
			System.out.println("Aplicação obrigatória de 2% de juros. Total: R$" + soma3);
			}
		if (saldo > 1000 && saldo <= 3000) {
			soma1 = saldo*0.4;
			soma2 = saldo + saldo*0.4;
			soma3 = soma2 - soma2*0.002;
			System.out.println("Você recebeu 40% de crédito especial em cima do seu valor de saldo médio.");
			System.out.println("Total do crédito especial: R$" + soma1);
			System.out.println("Seu total é: R$" + soma2);
			System.out.println("Aplicação obrigatória de 2% de juros. Total: R$" + soma3);
			}
		if (saldo > 3000) {
			soma1 = saldo*0.5;
			soma2 = saldo + saldo*0.5;
			soma3 = soma2 - soma2*0.002;
			System.out.println("Você recebeu 50% de crédito especial em cima do seu valor de saldo médio.");
			System.out.println("Total do crédito especial: R$" + soma1);
			System.out.println("Seu total é: R$" + soma2);
			System.out.println("Aplicação obrigatória de 2% de juros. Total: R$" + soma3);
			}
	}

}
