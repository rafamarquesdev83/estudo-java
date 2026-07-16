package lambdas;

import java.util.function.Function;
import java.util.function.Predicate;

public class Desafio {

	public static void main(String[] args) {

		Produto p = new Produto("iPAD", 3235.89, 0.13);
		Function<Produto, Double> precoReal = produto ->  produto.preco * ( 1 - produto.desconto); 
		System.out.println(precoReal.apply(p));
		Double preco = precoReal.apply(p);
		
		Function<Double, Double> impMun =  impoMun -> impoMun >= 2500 ? impoMun * 0.085 : 0.0; 
		System.out.println(impMun.apply(preco));
	}
}
