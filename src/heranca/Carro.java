package heranca;

public class Carro {

	public double velocidadeAtual;

	public void acelerar() {

		velocidadeAtual += 5;
	}

	public void frear() {

		if(velocidadeAtual >= 5) {
			
			velocidadeAtual -= 5;
		}else {
			
			velocidadeAtual = 0;
		}

	}

}
