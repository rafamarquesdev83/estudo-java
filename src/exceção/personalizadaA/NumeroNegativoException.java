package exceção.personalizadaA;

public class NumeroNegativoException extends RuntimeException {

    private String nomeDoAtributo;
    
    NumeroNegativoException(String nomeDoAtributo) {
        
}
 public String getMessage() {
        return String.format("O atributo '%s' está fora do intervalo", nomeDoAtributo);

}
}
