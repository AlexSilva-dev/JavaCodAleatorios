package exemplocontacorrenteclasse;

import java.util.Scanner;

public class ExemploContaCorrente {

    public static class InfoLancamento {

        public double valorDeposito;
        public String nomeDepositante;
    };

    public static void main(String[] args) {
        InfoLancamento[] contaCorrente = new InfoLancamento[5];
        int numeroLancamento = -1;
        double valorDeposito;
        String nome;
        InfoLancamento infoLancamento;

        int op;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1 - Depositar Valor");
            System.out.println("2 - Sacar Valor");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Consultar Histórico");
            System.out.println("0 - Sair");
            System.out.println("Entre com uma opção: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Nome de quem deposita");
                    nome = sc.next();
                    System.out.println("Valor para Depósito");
                    valorDeposito = sc.nextDouble();

                    infoLancamento = new InfoLancamento();
                    infoLancamento.valorDeposito = valorDeposito;
                    infoLancamento.nomeDepositante = nome;
                    numeroLancamento++;
                    contaCorrente[numeroLancamento] = infoLancamento;
                    break;
                case 2:
                    System.out.println("Nome de quem Saca");
                    nome = sc.next();
                    System.out.println("Valor para Depósito");
                    valorDeposito = sc.nextDouble();

                    infoLancamento = new InfoLancamento();
                    infoLancamento.valorDeposito = valorDeposito * (-1);
                    infoLancamento.nomeDepositante = nome;
                    numeroLancamento++;
                    contaCorrente[numeroLancamento] = infoLancamento;
                    break;
                case 3:
                    double total = 0.0;
                    for (int i=0; i<=numeroLancamento; i++) {
                        total += contaCorrente[i].valorDeposito;
                    }
                    System.out.println("Saldo da Conta " + total);
                    break;
                case 4:
                    System.out.println("[");
                        for (int i=0; i<=numeroLancamento; i++) {
                        System.out.println(contaCorrente[i].nomeDepositante
                                + " " + contaCorrente[i].valorDeposito);
                    }
                    System.out.println("]");
                    break;
            }
        } while (op != 0);
    }

}
