package QuestoesDaTerceiraLista;

import java.util.Scanner;

public class PrimeiraQuestao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double notas = 0;

        System.out.println("Digite suas notas ");

        for (int i = 0; i < 4; i++) {
            double notasRecebidas = teclado.nextDouble();
            notas = notas + notasRecebidas;
        }
        double notasRecebidas = notas / 4;
        if (notasRecebidas > 7){
            System.out.println("Parabéns aprovado!");
        } else {
            System.out.println("Está de recuperação!");
        }

    }
}
