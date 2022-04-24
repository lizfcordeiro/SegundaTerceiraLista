package QuestoesDaTerceiraLista;

import java.util.Scanner;

public class QuartaQuestao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] vet = new int[5];
        System.out.println("Por favor digite os 5 números: ");

        for(int i = 0; i < vet.length; i++){
            vet[i] = teclado.nextInt();
        }

        for (int i = 1; i < vet.length; i++){
            for (int j = 0; j < i; j++){
                if (vet[i] > vet[j]){
                    int temp = vet[i];
                    vet[i] = vet[j];
                    vet[j] = temp;
                }
            }
        }
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
    }
}
