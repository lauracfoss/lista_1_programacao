package lista_1;

import java.util.Scanner;

public class Questão_8 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe nota 1:");
		double nota1 = s.nextDouble();
		
		System.out.println("Informe nota 2:");
		double nota2 = s.nextDouble();
		
		System.out.println("Informe nota 3:");
		double nota3 = s.nextDouble();
		
		System.out.println("Informe nota 4:");
		double nota4 = s.nextDouble();
		
		if (nota1 > 0 && nota1 <=10 && nota2 > 0 && nota2 <=10 && nota3 > 0 && nota3 <=10 && nota4 > 0 && nota4 <=10) {
			double media = (nota1 + nota2 + nota3 + nota4)/4;
			System.out.println("Sua média é: " + media);
			}
		
		double media = (nota1 + nota2 + nota3 + nota4)/4;
		
		if (media >= 7) {
			System.out.println("Você foi aprovado!");
			}
		
		if (media < 7) {
			System.out.println("Você foi reprovado :( ");
			System.out.println("Informe sua nota do exame:");
			double nota5 = s.nextDouble();
		    double media2 = (nota1 + nota2 + nota3 + nota4 + nota5)/5;
			
		
		    if (media2 >= 5 ) {
			System.out.println("Sua média é: " + media2);
			System.out.println("Você foi aprovado pelo exame!");
		    	}
		
		    if (media2 < 5 ) {
			System.out.println("Sua média é: " + media2);
			System.out.println("Você foi reprovado.");
		    	}
		}
	}

}
