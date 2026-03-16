package lista_1;

import java.util.Scanner;

public class Questão_2 {

	public static void main(String[] args) {
    //Construa uma tabela de IMC = peso/altura*altura, e de acordo com a tabela estabelecida,
	// indique se a pessoa está abaixo do peso, peso ideal, sobre peso, obeso ou obeso mórbido.
		
	Scanner s = new Scanner (System.in);
	
	//Pedir informação 1 - peso
	
	System.out.println("Descubra seu Índice de Massa Corporal (IMC) preenchendo as informações abaixo:");
	
	System.out.println("Informe seu peso corporal em kg:");
	double v1 = s.nextDouble();
	
	System.out.println("Informe sua altura em metros:");
	double v2 = s.nextDouble();
	
	// Calcular o IMC com os dois valores
	
    double imc = v1/(v2*v2);
    System.out.println("O valor do seu IMC é "+ imc );
    
    // De acordo com o resultado, determinar o "diagnóstico"
    
    if (imc < 20) {
    	System.out.println("Resultado: abaixo do peso corporal ideal");
    	}
    if (imc > 20 && imc <= 25) {
    	System.out.println("Resultado: peso corporal ideal");
    	}
    if (imc > 25 && imc <= 30 ) {
    	System.out.println("Resultado: sobre peso");
    	}
    if (imc > 30 && imc <= 40 ) {
    	System.out.println("Resultado: Obesidade");
    	}		
    if (imc >= 40 ) {
    	System.out.println("Resultado: Obesidade mórbida");
     	}	
		
	}

}
