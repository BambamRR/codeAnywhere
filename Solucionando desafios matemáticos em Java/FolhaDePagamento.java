
//Desafio 3

Precisamos saber quanto uma determinada empresa deve pagar para seus colaboradores, porém temos apenas a quantidade de horas trabalhadas e o valor hora. Escreva um programa que leia o número de um colaborador, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse colaborador. Em seguida, apresente o número e o salário do colaborador, com duas casas decimais.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class MinhaPrimeiraClasse {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int valor1 = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    int valor2 = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    double valor3 = Double.parseDouble(st.nextToken());

    double salary = valor2 * valor3; 
    System.out.println("NUMBER = " + valor1);
    System.out.printf("SALARY = U$ %.2f", salary);
  }
}