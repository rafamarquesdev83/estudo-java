package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		
	
	
	Carro c1 = new Carro("Civic", "honda", 97);
	Carro c2 = new Carro("Uno", "Fiat", 2000);
	Carro c3 = new Carro("Bravo", "Fiat", 2008);
	
	List<Carro> carros = Arrays.asList(c1, c2, c3);
	
	Predicate<Carro> carroItaliano = 
			c -> c.modelo == "Fiat";
	Function<Carro, String> carrosItalianos = 
			c -> " Carros da Italia " + c.nome;
	
   carros.stream()
         .filter(carroItaliano)
         .map(carrosItalianos)
         .forEach(System.out::println);
	      

}
}