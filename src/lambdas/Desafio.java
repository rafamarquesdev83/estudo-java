package lambdas;

import java.util.function.Function;


public class Desafio {

	public static void main(String[] args) {

		Produto p = new Produto("iPAD", 3235.89, 0.13);
		Function<Produto, Double> precoReal = produto ->  produto.preco * ( 1 - produto.desconto); 
		System.out.println(precoReal.apply(p));
		Double preco = precoReal.apply(p);
		
		Function<Double, Double> impMun =  impoMun -> impoMun >= 2500 ? impoMun * 0.085 : 0.0; 
		System.out.println(impMun.apply(preco));
		
		Function<Produto, Double> valorFrete = produto -> produto.preco >= 3000.00 ? produto.preco * 1.0 : produto.preco / 2.0;
		System.out.println("R$ " + String.format ("%.2f",Math.round(valorFrete.apply(p) * 100.0) / 100.0).replace(".", ","));
	} 
}
