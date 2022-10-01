package exemplocontacorrente;

public class Banco {

    private String nomeBanco;
    private ContaCorrente[] contasCorrenteDoBanco;
    static int ultimaContaCorrente = -1;

    public Banco() {
    }

    public Banco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
        this.contasCorrenteDoBanco = new ContaCorrente[10];
    }

    public void inserirContaCorrente(ContaCorrente conta) {
        ultimaContaCorrente++;
        contasCorrenteDoBanco[ultimaContaCorrente] = conta;
    }

    @Override
    public String toString() {
        String contasdoBanco = "";
        if (ultimaContaCorrente >= 0) {
            for (int i = 0; i <= ultimaContaCorrente; i++) {
                contasdoBanco += this.contasCorrenteDoBanco[i].toString() + "\n";
            }
        } else {
            contasdoBanco = "Não há contas correntes no banco";
        }
        return contasdoBanco;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public ContaCorrente getContaCorrenteNoBanco(int numeroContaCorente) {
        int i = 0;
        while ((i >= 0) && (i <= ultimaContaCorrente)) {
            if (this.contasCorrenteDoBanco[i].getNumeroConta() == numeroContaCorente) {
                return this.contasCorrenteDoBanco[i];
            }
            i++;
        }
        return null;
    }

}
