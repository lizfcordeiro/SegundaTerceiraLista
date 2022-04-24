package QuestoesDaTerceiraLista;

import java.util.Scanner;

public class SegundaQuestao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 1;
        while(numero != 0){
            System.out.println("Digite um número: ");
            numero = teclado.nextInt();

            if (numero > 0){
                System.out.println("O número é positivo ");
            } else if (numero < 0) {
                System.out.println("O número é negativo ");
            }
        }

    }
}
