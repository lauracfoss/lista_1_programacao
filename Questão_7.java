package lista_1;

import java.util.Scanner;

public class Questão_7 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe um número pertencente ao conjuntos dos inteiros e descubra se ele é um número par ou ímpar");
		
		int ip = s.nextInt();
		
		if (ip % 2 == 0) {
			System.out.println("O número " + ip + " pertence ao conjunto de números pares.");
		} else {
			System.out.println("O número " + ip + " pertence ao conjunto de números ímpares.");
		}

	}

}
