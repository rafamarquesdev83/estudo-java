package heranca.teste;

import heranca.Civic;
import heranca.Ferrari;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		Civic civic = new Civic();
		Ferrari ferrari = new Ferrari();
		
		
		civic.acelerar();
		civic.acelerar();
		civic.frear();
		
		
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.frear();
		
		
		
		System.out.println(civic.velocidadeAtual);
		System.out.println(ferrari.velocidadeAtual);
		
	}

}
