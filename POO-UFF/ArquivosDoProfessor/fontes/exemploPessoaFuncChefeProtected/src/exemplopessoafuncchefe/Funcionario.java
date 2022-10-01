package exemplopessoafuncchefe;

public class Funcionario extends Pessoa {

    protected double salario;

    public Funcionario() {
    }

    public Funcionario(double salario, String nome, int identidade) {
        this.nome = nome;
        this.identidade = identidade;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        String resultado;
        resultado = "Nome: "+ this.nome + "\n";
        resultado += "Identidade: " + this.identidade + "\n";
        resultado += "Salário: " + this.salario + "\n";
        return resultado;
    }

}
