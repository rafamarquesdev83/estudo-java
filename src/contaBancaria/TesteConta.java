package contaBancaria;

public class TesteConta {
	
	public static void main(String[] args) {
		
		ContaBancaria conta = new ContaBancaria("Marco", 500.0);
		
		conta.depositar(200);
		conta.sacar(100);
		
		
		System.out.println(conta.exibirSaldo());
		
	}

}
