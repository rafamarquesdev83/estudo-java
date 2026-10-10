package exceção;

public class ChecadaVsNaoChecada {
    public static void main(String[] args) {
       try{
        geraErro1();
       }catch(RuntimeException e){
        System.out.println(e.getMessage());
       }
       try{
        geraErro2(); 
         }catch(Throwable e){

        System.out.println(e.getMessage());
         }
    }

    // Não checada ou não
    static void geraErro1() {
        throw new RuntimeException(" Ocoreu um erro bem legal #01");
    }
    // Exceção checada ou verificada
    static void geraErro2() throws Exception {
        
            throw new Exception(" Ocoreu um erro bem legal #02");
       

    }

}
