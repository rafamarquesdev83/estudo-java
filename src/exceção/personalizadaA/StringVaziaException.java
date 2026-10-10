package exceção.personalizadaA;

public class StringVaziaException extends RuntimeException {

    private String nomeDoAtributo;
    
    StringVaziaException(String nomeDoAtributo) {
        
}
 public String getMessage() {
        return String.format("O atributo %s está vazio", nomeDoAtributo);

}
}
