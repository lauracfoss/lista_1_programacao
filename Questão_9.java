package lista_1;

import java.util.Scanner;

public class Questão_9 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Digite 5 valores pertencentes ao conjunto dos números inteiros para calcular a média entre eles ");
		
		System.out.println("Informe o valor 1:");
		int v1 = s.nextInt();
		
		System.out.println("Informe o valor 2:");
		int v2 = s.nextInt();
			
		System.out.println("Informe o valor 3:");
		int v3 = s.nextInt();
		
		System.out.println("Informe o valor 4:");
		int v4 = s.nextInt();
		
		System.out.println("Informe o valor 5:");
		int v5 = s.nextInt();
		
		int media = (v1 + v2 + v3 + v4 + v5)/5;
		
		if (v1 < 0 || v1 > 0 && v2 < 0 || v2 > 0 && v3 < 0 || v3 > 0 && v4 < 0 || v4 > 0 && v5 < 0 || v5 > 0 ) {
		 System.out.println("A média é igual a: " + media);
		}
		if (media < v1 ) {
		System.out.println(" Valor 1 = " + v1 + " é maior que a média apurada.");
		}
		if (media < v2 ) {
			System.out.println(" Valor 2 = " + v2 + " é maior que a média apurada.");
			}
		if (media < v3 ) {
			System.out.println(" Valor 3 = " + v3 + " é maior que a média apurada.");
			}
		if (media < v4 ) {
			System.out.println(" Valor 4 = " + v4 + " é maior que a média apurada.");
			}
		if (media < v5 ) {
			System.out.println(" Valor 5 = " + v5 + " é maior que a média apurada.");
			}
		
	}

}
