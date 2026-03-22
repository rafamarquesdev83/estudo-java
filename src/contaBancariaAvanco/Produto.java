package contaBancariaAvanco;

public class Produto {

	String nome;
	double preco;

	Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	double aplicarDesconto(double percentual) {

		return  preco * (1 - (percentual / 100));
	}

	void exibir() {
		
		System.out.println(" Produto:" +  nome);
		System.err.println(" Preço atual: R$ " +  preco);

	}
}
