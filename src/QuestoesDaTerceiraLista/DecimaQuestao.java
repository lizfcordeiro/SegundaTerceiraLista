package QuestoesDaTerceiraLista;

import java.util.Random;
import java.util.Scanner;

public class DecimaQuestao {
    public static void main(String[] args) {
        Random random = new Random();
        int numero = random.nextInt(10);
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Tente adivinhar o número: ");
            int teste1 = teclado.nextInt();
            if (teste1 == numero) {
                System.out.println("Você acertou ");
                break;
            } else if (teste1 < numero) {
                System.out.println("Seu número é menor ");
            } else if (teste1 > numero) {
                System.out.println("Seu número é maior");
            }
        }
    }
}