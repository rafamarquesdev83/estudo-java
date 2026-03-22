package desafio;

public class Pessoa {

	String nome;
	Double peso;

	Pessoa(String nome, Double peso) {

		this.nome = nome;
		this.peso = peso;
	}

	void comer(Comida comida) {

		this.peso += comida.peso;

	}
	
	String apresentar() {
		 
		return "Olá eu sou o " + nome + "e tenho" + peso;
		
	}

}
