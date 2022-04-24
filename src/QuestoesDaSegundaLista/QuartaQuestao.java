package QuestoesDaSegundaLista;

import java.util.Scanner;

public class QuartaQuestao {
    public static void main(String[] args) {
        String[] nomePraia = new String[5];
        double[] distancia = new double[5];

        double maiorDistancia = 0;
        String nomeDaPraiaMaisDistante = "";
        double soma = 0;

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Escreva o nome da praia ");
            nomePraia[i] = teclado.nextLine();
            System.out.println("Escreva a distância da praia ");
            distancia[i] = teclado.nextDouble();
            teclado.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            soma += distancia[i];

            if (distancia[i] < 10) {
                System.out.println("A praia " + nomePraia[i] + " tem distância menor que 10");
            } else if (distancia[i] > 15) {
                System.out.println("A praia " + nomePraia[i] + " tem distância maior que 15");
            }
            if (distancia[i] > maiorDistancia){
                maiorDistancia = distancia[i];
                nomeDaPraiaMaisDistante = nomePraia[i];
            }

        }

        double media = soma / nomePraia.length;
        System.out.printf("A praia mais distânte é %s\nA média da distância é %.2f", nomeDaPraiaMaisDistante, media);
    }
}
