
//Desafio 1

//Rubens quer calcular e mostrar a quantidade de litros de combustível gastos em uma viagem de carro, sendo que seu carro faz 12 KM/L. 
//Como ele não sabe fazer um programa que o auxilie nessa missão, ele te pede ajuda. Para efetuar o cálculo, deve-se fornecer o tempo gasto
//em horas na viagem e a velocidade média durante a mesma em km/h. Assim, você conseguirá passar para Rubens qual a distância percorrida e,
//em seguida, calcular quantos litros serão necessários para a viagem que ele quer fazer. Mostre o valor com 3 casas decimais após o ponto.

import java.util.Scanner;

public class Main{
	public static void main(String[] args){

               

		Scanner scan = new Scanner(System.in);
		int th = scan.nextInt();
		int vm = scan.nextInt();
		
	


		System.out.printf("%.3f\n", ( th * vm )/12.0);
	}
}