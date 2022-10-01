package exemploehumtemum;

public class Funcionario extends Pessoa {

    protected double salario;

    public Funcionario(double salario, String nome, String endereco) {
        super(nome, endereco);
        this.salario = salario;
    }

    public Funcionario() {
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
        resultado += "Endereco: " + this.endereco + "\n";
        resultado += "Salário: " + this.salario + "\n";
        return resultado;
    }

}
