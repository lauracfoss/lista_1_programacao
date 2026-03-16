package lista_1;

import java.util.Scanner;

public class Questão_10 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
	
		System.out.println("Informe o peso total do pescado:");
		double peso = s.nextDouble();
		double multa = (peso - 500)*4;
		
		if (peso > 500 ) {
			System.out.println("O peso excedeu o permitido. Uma multa de R$4,00 por quilo excedente será aplicada.");
			System.out.println("Valor total da multa: R$ " + multa);
			}
		
		if (peso < 500 ) {
			
			System.out.println("Peso total dentro das normas - aprovado.");
		}
		

	}

}
