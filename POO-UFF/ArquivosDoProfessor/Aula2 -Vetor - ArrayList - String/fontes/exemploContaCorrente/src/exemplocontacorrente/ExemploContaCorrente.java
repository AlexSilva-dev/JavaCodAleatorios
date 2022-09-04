package exemplocontacorrente;

import java.util.Scanner;

public class ExemploContaCorrente {

    public static void main(String[] args) {
        double[] contaCorrente = new double[5];
        int numeroLancamento = -1;
        double valorDeposito;

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
                    System.out.println("Valor para Depósito");
                    valorDeposito = sc.nextDouble();
                    numeroLancamento++;
                    contaCorrente[numeroLancamento] = valorDeposito;
                    break;
                case 2:
                    System.out.println("Valor para Saque");
                    valorDeposito = sc.nextDouble();
                    numeroLancamento++;
                    contaCorrente[numeroLancamento] = valorDeposito*(-1);
                    break;
                case 3:
                    double total = 0.0;
                    for (double valor : contaCorrente) {
                        total += valor;
                    }
                    System.out.println("Saldo da Conta " + total);
                    break;
                case 4: 
                    System.out.println("[");
                    for (double valor : contaCorrente) {
                        System.out.println(valor);
                    }
                    System.out.println("]");
                    break;
            }
        } while (op != 0);
    }

}
