package exemplocontacorrente;

public class ContaCorrente {

    private int numeroConta = 0;
    private String agencia;
    private String nomeCorrentista;
    private double saldo;
    private Lancamento[] lancamentos;
    static int ultimoLancamento = -1;
    static int sequenciaLancamentoGeral = 0;

    public ContaCorrente() {
        numeroConta = 0;
        this.agencia = "";
        this.nomeCorrentista = "";
        this.saldo = 0.0;
        this.lancamentos = new Lancamento[10];
    }

    public boolean sacarValor(double valor) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            sequenciaLancamentoGeral++;
            ultimoLancamento++;
            String hoje = Servicos.dataHoje();
            Lancamento auxLancamento = new Lancamento(valor, hoje, 'D', sequenciaLancamentoGeral);
            this.lancamentos[ultimoLancamento] = auxLancamento;
            return true;
        }
        return false;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        sequenciaLancamentoGeral++;
        ultimoLancamento++;
        String hoje = Servicos.dataHoje();
        Lancamento auxLancamento = new Lancamento(valor, hoje, 'C', sequenciaLancamentoGeral);
        this.lancamentos[ultimoLancamento] = auxLancamento;
    }

    public String extratoContaCorrente(){
        String descricao = "\nAgência: "+ this.agencia;
        descricao += "\nCorrentista: "+ this.nomeCorrentista;
        
        if (ultimoLancamento >= 0){
            String extrato = "\n"+descricao+"\n";
            
            for(int i =0; i<=ultimoLancamento; i++){
                extrato += this.lancamentos[i].toString();
            }
            extrato += "Saldo: "+Servicos.formataDinheiro(this.saldo);
            return extrato;
        } else{
            return "\nNão há lancamentos para a conta:\n"+descricao;
        }
    }

    public int getNumeroConta() {
            
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    
    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }
    
    @Override
    public String toString(){
       return "Ag.: "+this.agencia+" - "+this.numeroConta+" - "+
               this.nomeCorrentista+" - "+Servicos.formataDinheiro(this.saldo) +"\n";
    }
    
}
