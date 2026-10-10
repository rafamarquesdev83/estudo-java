package exceção.personalizadaB;

/**
 * NumeroForaDoIntervaloException
 */
public class NumeroForaDoIntervaloException extends Exception {

    private String nomeDoAtributo;

    public NumeroForaDoIntervaloException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    @Override
    public String getMessage() {
        return "O valor do atributo '" + nomeDoAtributo + "' está fora do intervalo permitido.";
    }

}
