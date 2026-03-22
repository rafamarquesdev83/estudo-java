package desafio;

public class Jantar {

	public static void main(String[] args) {

		Comida c1 = new Comida("Feijao", 0.180);
		Comida c2 = new Comida("arroz", 0.300);

		Pessoa p1 = new Pessoa("joão", 99.8);

		System.out.println(p1.apresentar());

		p1.comer(c1);

		System.out.println(p1.apresentar());

		p1.comer(c2);

		System.out.println(p1.apresentar());

	}

}
