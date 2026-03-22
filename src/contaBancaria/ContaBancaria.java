package contaBancaria;

public class ContaBancaria {
	
	String titular;
	double saldo;
	
	ContaBancaria(String titular, double saldo){
		
		this.titular = titular;
		this.saldo = saldo;
		
	}
	
	void  depositar(double valor) {
		
		this.saldo += valor;
	}
	
	void sacar( double valor) {
		
		if( saldo > 0) {
			this.saldo -= valor;
			
			System.out.println("Valor saldo atualizado");
			
		} else {
			
			System.out.println("Não há saldo");
		}
	}
	
      Double exibirSaldo() {
    	   
    	 return this.saldo;
       }
	

}
