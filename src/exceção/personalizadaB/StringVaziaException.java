package exceção.personalizadaB;

public class StringVaziaException extends Exception {

    private String nomeDoAtributo;
    
    StringVaziaException(String nomeDoAtributo) {
        
}
 public String getMessage() {
        return String.format("O atributo %s está vazio", nomeDoAtributo);

}
}
