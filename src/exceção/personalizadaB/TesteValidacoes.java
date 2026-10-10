package exceção.personalizadaB;

import exceção.Aluno;

public class TesteValidacoes {

    public static void main(String[] args) throws NumeroForaDoIntervaloException {
        
        try {
            Aluno aluno = new Aluno("Ana", 7); 
            Validar.aluno(aluno);
            Validar.aluno(null);
        } catch (StringVaziaException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            } catch (NumeroNegativoException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

            System.out.println("Fim");
        }
    

}

