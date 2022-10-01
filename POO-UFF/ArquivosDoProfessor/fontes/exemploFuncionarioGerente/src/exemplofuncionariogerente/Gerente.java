package exemplofuncionariogerente;

public class Gerente extends Funcionario {

    protected int senha;

    public Gerente(int senha, String nome, String cpf, double salario) {
        super(nome, cpf, salario);
        this.senha = senha;
    }

    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    
    public boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Acesso Permitido!");
            return true;
        } else {
            System.out.println("Acesso Negado!");
            return false;
        }
    }

    @Override
    public double getBonificacao() {
        return this.salario * 0.18;
    }
}
