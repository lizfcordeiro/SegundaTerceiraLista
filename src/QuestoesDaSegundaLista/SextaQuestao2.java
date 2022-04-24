package QuestoesDaSegundaLista;

import java.util.Scanner;

public class SextaQuestao2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] listaDeNumeros = new double[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite 4 números ");
            listaDeNumeros[i] = teclado.nextDouble();
        }
        double soma = 0;
        for(int i = 0; i < 4; i++){
         soma += Math.pow(listaDeNumeros[i], 2);
        }

        System.out.println(soma);
    }
}
