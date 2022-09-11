/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Part2;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author alexaleq321
 */
public class OperarArraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tcld = new Scanner(System.in);
        int op = 1;
        ArrayList<Integer> objArray = new ArrayList<>();
        int tamArray = 4;
        int ind = -1;

        while (op != 0)
        {
            System.out.println("\n\n\t\t\t______MENU______\n");
            System.out.println("Digite a opção desejada:");
            System.out.println("0. Para sair");
            
            System.out.println("1. Insirir");
            System.out.println("2. Remover");
            System.out.println("3. Imprimir vetor");
            op = Integer.parseInt(tcld.nextLine());

            switch (op)
            {
                case 1:
                    if (ind < tamArray)
                    {
                        System.out.println("Digite um número para inserir no vetor: ");
                        Integer num = Integer.parseInt(tcld.nextLine());
                        objArray.add(num);
                        ind++;
                    } else
                    {
                        System.out.println("\n\t\t\tERRO! \n\t\tO ArrayList esta cheio");
                    }
                    break;

                case 2:
                    System.out.println("Digite o índice para remoção: ");
                    int indice = Integer.parseInt(tcld.nextLine());
                    if (indice <= ind && indice >= 0)
                    {
                        objArray.remove(indice);
                        System.out.println("removido");
                        ind--;
                    } else
                    {
                        System.out.println("\n\t\t\tERRO! \n\t\tÍndice não existente");
                    }
                    break;

                case 3:
                    System.out.println("\nElementos: ");
                    if(objArray.isEmpty()){
                        System.out.println("\n\tArray vazio!");
                    }
                    for (int cont = 0; cont < objArray.size(); cont++)
                    {
                        System.out.print(objArray.get(cont) + " | ");
                    }
                    break;

                case 0:
                    System.out.println("\nEncerrando... :(");

                    break;

                default:
                    System.out.println("\nOpção invalida! Digite apenas uma das opções.");

            }
        }
    }

}
