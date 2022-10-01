package exemplocontacorrente;

import java.util.Scanner;

public class ExemploContaCorrente {

    public static void main(String[] args) {

        Banco banco = new Banco("Itaú");
        int op;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1 - Cadastrar Conta no Banco");
            System.out.println("2 - Contas no Banco");
            System.out.println("3 - Deposito em Conta Corrente");
            System.out.println("4 - Saque em Conta Corrente");
            System.out.println("5 - Extrato de Conta Corrente");
            System.out.println("0 - Sair");
            System.out.println("Entre com uma opção: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    InterfaceUsuario.CadastrarConta(banco);
                    break;
                case 2:
                    InterfaceUsuario.ContaCorrentesNoBanco(banco);
                    break;
                case 3:
                    InterfaceUsuario.EfetuarDeposito(banco);
                    break;
                case 4:
                    InterfaceUsuario.EfetuarSaque(banco);
                    break;
                case 5:
                    InterfaceUsuario.ExtratoContaCorrente(banco);
                    break;
            }
            InterfaceUsuario.clearScreen();
        } while (op != 0);

    }

}
