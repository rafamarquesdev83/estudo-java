package treino;

public class CalculadoraSimples {

	double a, b;

	CalculadoraSimples() {
	}

	double somar(double a, double b) {

		this.a = a;
		this.b = b;

		return a + b;

	}
	
	
	double subtrair(double a, double b) {


		this.a = a;
		this.b = b;

		return  a - b;

	}
	
	double mult(double a, double b) {

		this.a = a;
		this.b = b;

		return a * b;

	}
	
	double div(double a, double b) {
	
		if(b!= 0) 
			
			return a / b;
			
		else {
			
			System.out.println("Erro: divisão por zero!");
			
			return 0;
		}

		

	}

}
