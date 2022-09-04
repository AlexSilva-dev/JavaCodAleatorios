/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Part1;

import java.util.Scanner;

/**
 *
 * @author alexaleq321
 */
public class OperarVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tcld = new Scanner(System.in);
        Vetor objVetor = new Vetor();
        int op=1;        
        

        while (op != 0) {
            System.out.println("\n\n\t\t\t___MENU___\n");
            System.out.println("0. Para sair");
            System.out.println("Digite a opção desejada:");
            System.out.println("1. Insirir");
            System.out.println("2. Remover");
            System.out.println("3. Imprimir vetor");
            op = Integer.parseInt(tcld.nextLine());

            switch (op) {
                case 1:
                    System.out.println("Digite um número para inserir no vetor: ");
                    int num = Integer.parseInt(tcld.nextLine());
                    objVetor.inserir(num);
                    break;

                case 2:
                    System.out.println("op 2");
                    break;

                case 3:

                    System.out.println("op 3");
                    break;

                case 0:
                    System.out.println("op sair");

                    break;

                default:
                    System.out.println("Opção invalida! Digite apenas uma das opções.");

            }
        }
        

    }

    public static class Vetor {
        public int vet[] = new int[5];
        public int ind;
        
        
        public Vetor(){
            ind = vet.length-1;
        }
        
        public void imprimir(){
            for(int n: vet){
                System.out.print(vet[n] + " ");
            }
        }
        
        public void inserir(int novo){
            if(ind>-1){
                vet[ind] = novo;
                ind -= 1;
                System.out.println("Inserido");
                return;
            }
            System.out.println("\n\t\t\tERRO! \n\t\t\tO Vetor esta cheio");
            return;
        }
        

    }

}
