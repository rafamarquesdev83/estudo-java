package oo.heranca_Desafio;

public class Ferrari extends Carro {

	public Ferrari(int velocidadeMaxima) {

		super(velocidadeMaxima);
	}

	@Override
	void acelerar() {
		velocidadeAtual = 15;
	}
}
