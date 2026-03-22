package contaBancariaAvanco;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p = new Produto ("Notebook", 3000.0);
		
		p.exibir();
		
		System.out.println("Preço com 10% de desconto: " + p.aplicarDesconto(10));  
		
	}

}
