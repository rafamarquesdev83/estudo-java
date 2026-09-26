package exceção;

public class Basico {
public static void main(String[] args) {
    Aluno a1 = null;
    try{
        imprimirNomeAluno(a1);
    }catch (Exception e){
        System.out.println("Ocorreu um erro ao imprimir o nome do aluno: " );
    }
    
    try{
        System.out.println(7/0);
}catch (ArithmeticException e){
   System.out.println("Ocorreu um erro ao dividir por zero: " + e.getMessage());
}
 System.out.println("Fim impressão");
}

private static void imprimirNomeAluno(Aluno aluno) {
    // TODO Auto-generated method stub
   System.out.println(aluno.nome);
}
}

