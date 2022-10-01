package exemplopessoafuncgerente;

public class ExemploPessoaFuncGerente {

     public static void main(String[] args) {
       Gerente gerente = new Gerente(123,"Gerente TI",5000,"Ana",12345678);
        
       System.out.println( (String) gerente.toString());
    }
}
