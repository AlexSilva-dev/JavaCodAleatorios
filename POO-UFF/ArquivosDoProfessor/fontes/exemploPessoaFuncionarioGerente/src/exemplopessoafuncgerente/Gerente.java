package exemplopessoafuncgerente;

public class Gerente extends Funcionario {

    private int senha;
    private String funcao;

    public Gerente(int senha, String funcao, double salario, String nome, int identidade) {
        super(salario, nome, identidade);
        this.senha = senha;
        this.funcao = funcao;

    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        String resultado;
        resultado = "Nome: " + super.getNome() + "\n";
        resultado += "Identidade: " + super.getIdentidade() + "\n";
        resultado += "Salário: " + super.getSalario() + "\n";
        resultado += "Salário: " + this.funcao + "\n";
        return resultado;
    }

}
