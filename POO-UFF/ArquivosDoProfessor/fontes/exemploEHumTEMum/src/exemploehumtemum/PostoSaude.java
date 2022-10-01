package exemploehumtemum;

public class PostoSaude {
    protected String nome;
    protected String endereco;
    protected Funcionario func;

    public PostoSaude() {
    }

    public PostoSaude(String nome, String endereco, Funcionario func) {
        this.nome = nome;
        this.endereco = endereco;
        this.func = func;
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

    public Funcionario getFunc() {
        return func;
    }

    public void setFunc(Funcionario func) {
        this.func = func;
    }
    
    
    
    
}
