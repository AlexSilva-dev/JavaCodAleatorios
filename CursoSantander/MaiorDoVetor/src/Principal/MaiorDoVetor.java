package Principal;

public class MaiorDoVetor {
    public static void main(String[] args){
        int vet[] = {20,1,-65,13,76,8,2,22,134};
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        for(int i=0; i<vet.length; i++){
            if (vet[i] > maior) {
                maior = vet[i];
            }
            if(vet[i]<menor){
                menor = vet[i];
            }
        }
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);

    }
}
