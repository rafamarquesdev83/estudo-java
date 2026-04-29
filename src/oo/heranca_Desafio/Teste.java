package oo.heranca_Desafio;

public class Teste {

	public static void main(String[] args) {

		Civic c1 = new Civic(200);
		c1.acelerar();

		Ferrari f1 = new Ferrari(300);
		f1.acelerar();

		System.out.println(c1.velocidadeAtual);
		System.out.println(f1.velocidadeAtual);
	}

}
