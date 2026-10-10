package exceção.personalizadaB;

public class NumeroNegativoException extends Exception {

    private String nomeDoAtributo;
    
    NumeroNegativoException(String nomeDoAtributo) {
        
}
 public String getMessage() {
        return String.format("O atributo '%s' está fora do intervalo", nomeDoAtributo);

}
}
