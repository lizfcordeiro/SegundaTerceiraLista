package QuestoesDaSegundaLista;

import java.util.Scanner;

public class QuintaQuestao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o tempo gasto na viagem ");
        double tempo = teclado.nextDouble();
        System.out.println("Informe a velocidade média da viagem ");
        double velocidadeMedia = teclado.nextDouble();

        double distancia = tempo * velocidadeMedia;
        double litros = distancia/12;

        System.out.println(litros + " litros");
    }
}
