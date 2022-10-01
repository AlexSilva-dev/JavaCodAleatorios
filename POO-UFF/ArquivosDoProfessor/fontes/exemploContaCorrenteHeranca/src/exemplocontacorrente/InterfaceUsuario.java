package exemplocontacorrente;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class InterfaceUsuario {

    private static ContaCorrente obterContaCorrente(Banco banco) {
        System.out.println(banco.toString());

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o número da Conta: ");
        int numeroContaCorrente;
        ContaCorrente auxContaCorrente;
        do {
            numeroContaCorrente = sc.nextInt();
            auxContaCorrente = banco.getContaCorrenteNoBanco(numeroContaCorrente);
            
        } while (auxContaCorrente == null);

        return auxContaCorrente;
    }

    public static Banco CadastrarConta(Banco banco) {
        InterfaceUsuario.clearScreen();
        System.out.println("CADASTRO DE CONTA");
        Scanner sc = new Scanner(System.in);
        ContaCorrente contaCorrente = new ContaCorrente();
        System.out.println("Nome do Cliente");
        String nome = sc.nextLine();
        contaCorrente.setNomeCorrentista(nome);
        System.out.println("Nome da Agência");
        String agencia = sc.nextLine();
        contaCorrente.setAgencia(agencia);
        System.out.println("Número da Conta");
        int numeroConta = sc.nextInt();
        contaCorrente.setNumeroConta(numeroConta);
        System.out.println("Depósito Inicial");
        double saldo = sc.nextDouble();
        contaCorrente.setSaldo(saldo);
        banco.inserirContaCorrente(contaCorrente);
        InterfaceUsuario.clearScreen();
        System.out.print("Conta Cadastrada com Sucesso");
        InterfaceUsuario.pausa();

        return banco;
    }

    public static void EfetuarDeposito(Banco banco) {

        InterfaceUsuario.clearScreen();
        ContaCorrente contaAtual = obterContaCorrente(banco);
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o valor para o depósito: ");
        double valor = sc.nextDouble();
        contaAtual.depositar(valor);
        InterfaceUsuario.clearScreen();
        System.out.print("Depósito Realizado com Sucesso");
        InterfaceUsuario.pausa();
    }

    public static void EfetuarSaque(Banco banco) {

        InterfaceUsuario.clearScreen();
        ContaCorrente contaAtual = obterContaCorrente(banco);
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o valor para o saque: ");
        double valor = sc.nextDouble();
        boolean resultadoSaque = contaAtual.sacarValor(valor);
        InterfaceUsuario.clearScreen();
        if (resultadoSaque) {
            System.out.println("Saque realizado com Sucesso");
        } else {
            System.out.println("Saque NÃO realizado");
        }
        InterfaceUsuario.pausa();
    }

    public static void ContaCorrentesNoBanco(Banco banco){
        InterfaceUsuario.clearScreen();
        System.out.println("CONTAS NO BANCO");
        System.out.println(banco.toString());
        InterfaceUsuario.pausa();
    }
    
    public static void ExtratoContaCorrente(Banco banco) {
        InterfaceUsuario.clearScreen();
        ContaCorrente contaAtual = obterContaCorrente(banco);
        InterfaceUsuario.clearScreen();
        System.out.print("Extrato da Conta");
        System.out.println(contaAtual.extratoContaCorrente());
        InterfaceUsuario.pausa();
    }

    public static void pausa() {
        System.out.println("\nContinue....");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
    }
    public static void clearScreen() {

        try {
            Robot robot = new Robot();
            robot.setAutoDelay(10);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_L);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_L);
        } catch (AWTException ex) {
        }
    }

}
