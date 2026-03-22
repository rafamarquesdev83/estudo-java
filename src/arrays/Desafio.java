package arrays;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] Args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println(" Quantas notas vc quer informar?");

		int quantidade = scanner.nextInt();

		double[] notas = new double[quantidade];

		for (int i = 0; i < notas.length; i++) {

			System.out.println(" Digita a nota " + (i + 1));

			notas[i] = scanner.nextDouble();
		}

		double soma = 0;

		for (double nota : notas) {

			soma += nota;
		}
		
		System.out.println(soma/quantidade);
		
		scanner.close();

	}
	
	

}
