package exemplocontacorrente;

public class Lancamento {

    protected double valor;
    protected String dataLancamento;
    protected char tipoLancamento;
    protected int sequenciaLancamento;

    public Lancamento() {
    }

    public Lancamento(double valor, String dataLancamento, char tipoLancamento, int sequenciaLancamento) {
        this.valor = valor;
        this.dataLancamento = dataLancamento;
        this.tipoLancamento = tipoLancamento;
        this.sequenciaLancamento = sequenciaLancamento;
    }

    @Override
    public String toString() {
        
       String seq = Integer.toString(sequenciaLancamento);
       String descricao =  seq +" "+ dataLancamento+" "+tipoLancamento+" "
               +Servicos.formataDinheiro(valor)+"\n";
       return descricao;
    }

}
