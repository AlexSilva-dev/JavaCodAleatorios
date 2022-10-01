package exemplopessoafunc;

public class Funcionario extends Pessoa {

    private double salario;

    public Funcionario() {
    }

    public Funcionario(double salario, String nome, int identidade) {
        super(nome, identidade);
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
        resultado = "Nome: "+ super.getNome() + "\n";
        resultado += "Identidade: " + super.getIdentidade() + "\n";
        resultado += "Salário: " + this.salario + "\n";
        return resultado;
    }

}
