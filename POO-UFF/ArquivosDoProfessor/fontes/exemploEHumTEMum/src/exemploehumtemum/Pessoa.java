package exemploehumtemum;

public class Pessoa {

    protected String nome;
    protected String endereco;

    public Pessoa() {
    }

    public Pessoa(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    @Override
    public String toString() {
        String resultado;
        resultado = "Nome: "+ this.nome + "\n";
        resultado += "Endereco: " + this.endereco + "\n";
        return resultado;
    }
}
