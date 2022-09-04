package exemploarraylist;

import java.util.ArrayList;

public class ExemploArrayList {

    public static void main(String[] args) {
        // Creating an array list
        ArrayList<Integer> numeros = new ArrayList<>();

        // Inserir os valores
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        
        // imprimindo o segundo valor
        System.out.println(numeros.get(2));
        
        // usando de forma padrão
        System.out.println("Forma Padrão");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(i);
        }

        // usando iterador
         System.out.println("Por iterador");
        for (Integer num : numeros) {
            System.out.println(num);
        }
    }

}
