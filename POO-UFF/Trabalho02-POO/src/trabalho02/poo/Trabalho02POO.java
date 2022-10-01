/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalho02.poo;
import java.util.ArrayList;
import Class.*;
import java.util.Scanner;
/**
 *
 * @author alex
 */
public class Trabalho02POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Menu menu = new Menu();
        Scanner teclado1 = new Scanner(System.in);
        int op = -1;
        while(op!=0){
            menu.inicio();
            op = Integer.parseInt(teclado1.nextLine());
            switch(op){
                case 0: 
                    System.out.println("Encerrando.");
                    break;
                case 1:
                    
                    menu.add();
                    break;
                case 2:
                    menu.consultar();
                    break;
            }
            
        }
    }
    
    public static class Menu{
        Scanner teclado = new Scanner(System.in);
        ArrayList<Funcionario> arrayFunci = new ArrayList<>();
        ArrayList<Gerente> arrayGerent = new ArrayList<>();
        public void inicio(){
            System.out.println("\n\n\n\t\t_____Menu_____\n");
            System.out.println("Digite a opção desejada:");
            System.out.println("0. Para sair.");
            System.out.println("1. Cadastrar novo funcionário.");
            System.out.println("2. Consultar funcionário.");
        }
        public void add(){
            System.out.println("\n\n\t\tCadastrando funcionario\n\n");
            int funGer = -1;
            while(true){
                int matri;
                String nome;
                float sal;
                float dedu;
                int categ;
                String depart;


                System.out.println("\nDigite a opções desejada:");
                System.out.println("0. Sair do cadastro.");
                System.out.println("1. Cadastrar funcionário.");
                System.out.println("2. Cadastrar gerente.");
                funGer = Integer.parseInt(teclado.nextLine());
                
                if(funGer==1 || funGer==2){
                    System.out.println("Digite a matricula: ");
                    matri = Integer.parseInt(teclado.nextLine());

                    System.out.println("Digite o nome: ");
                    nome = teclado.nextLine();

                    System.out.println("Digite o salario: ");
                    sal = Float.parseFloat(teclado.nextLine());

                    System.out.println("Digite a dedução: ");
                    dedu = Float.parseFloat(teclado.nextLine());

                    if(funGer==1){
                        Funcionario novo = new Funcionario(matri, nome, sal, dedu);
                        arrayFunci.add(novo);

                    }else{
                        System.out.println("Digite a categoria do gerente (1 ou 2): ");
                        categ = Integer.parseInt(teclado.nextLine());

                        System.out.println("Digite o departamento do gerente: ");
                        depart = teclado.nextLine();

                        Gerente novo = new Gerente(matri, nome, sal, dedu, categ, depart);
                        arrayGerent.add(novo);

                    }
                    System.out.println("\nAdicionado!\n");


                }else if(funGer==0){
                    System.out.println("\n\n\t\tVoltando para o Menu...");
                    return;
                }else{
                    System.out.println("\n\n\t\tOpção incorreta!\n\n");
                    break;
                }
            }
            
            
        }
        public void consultar(){
            int cons;
            int ind;
            System.out.println("\n\nDigite a opção desejada:\n");
            System.out.println("1. Consultar funcionario.");
            System.out.println("2. Consultar Gerente.");
            cons = Integer.parseInt(teclado.nextLine());
            if(cons==1){
                System.out.println("\n\nDigite qual funcionário deseja consultar:\n");
                for(int i=0; i<arrayFunci.size(); i++){
                    System.out.println(i +". "+ arrayFunci.get(i).getNome());
                }
                ind = Integer.parseInt(teclado.nextLine());
                System.out.println( arrayFunci.get(ind).toString());
                
            }else if(cons==2){
                System.out.println("\n\nDigite qual gerente deseja consultar:\n");

                for(int i=0; i<arrayGerent.size(); i++){
                    System.out.println(i + ". "+ arrayGerent.get(i).getNome());
                } 
                ind = Integer.parseInt(teclado.nextLine());
                System.out.println( arrayGerent.get(ind).toString());
            }
            
        }
    }
    
}
