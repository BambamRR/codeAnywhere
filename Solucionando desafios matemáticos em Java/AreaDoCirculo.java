//Desafio 2

//A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para este problema que π = 3.14159:
//- Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.

import java.util.Scanner; 

public class Classe{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		

		double raio = scan.nextDouble();

		double area = 3.14159 * (Math.pow( raio ,2));

		System.out.printf("A=%.4f\n", area);
	}
}