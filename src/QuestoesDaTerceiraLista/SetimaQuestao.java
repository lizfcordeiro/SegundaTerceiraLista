package QuestoesDaTerceiraLista;

import java.util.Scanner;

public class SetimaQuestao {
    public static void main(String[] args) {
        int numeroFatorial = 1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escreva um número inteiro, maior que zero ");
        int numero = teclado.nextInt();
        for (int i = 1; i <= numero; i++){
            numeroFatorial = numeroFatorial * i;
            System.out.println(numeroFatorial);
        }
    }
}
