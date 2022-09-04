package exemplocontacorrenteclassearraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ExemploContaCorrente {

    public static class InfoLancamento {

        public double valorDeposito;
        public String nomeDepositante;
    };

    public static void main(String[] args) {
        ArrayList<InfoLancamento> contaCorrente = new ArrayList<>();
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
                    contaCorrente.add(infoLancamento);

                    break;
                case 2:
                    System.out.println("Nome de quem Saca");
                    nome = sc.next();
                    System.out.println("Valor para Depósito");
                    valorDeposito = sc.nextDouble();

                    infoLancamento = new InfoLancamento();
                    infoLancamento.valorDeposito = valorDeposito * (-1);
                    infoLancamento.nomeDepositante = nome;
                    contaCorrente.add(infoLancamento);
                    break;
                case 3:
                    double total = 0.0;
                    for (InfoLancamento auxInfoLancamento : contaCorrente) {
                        total += auxInfoLancamento.valorDeposito;
                    }
                    System.out.println("Saldo da Conta " + total);
                    break;
                case 4:
                    System.out.println("[");
                    for (InfoLancamento auxInfoLancamento : contaCorrente) {
                        System.out.println(auxInfoLancamento.nomeDepositante
                                + " " + auxInfoLancamento.valorDeposito);
                    }
                    System.out.println("]");
                    break;
            }
        } while (op != 0);
    }

}
