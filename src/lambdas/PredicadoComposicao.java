package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {
	public static void main(String[] args) {
		Predicate<Integer> insPar = num -> num % 2 == 0;
		Predicate<Integer> insTresDigitos = num -> num >= 100 && num <= 999;
		
		System.out.println(insPar.and(insTresDigitos).test(123));
		System.out.println(insPar.or(insTresDigitos).test(123));
}
}
