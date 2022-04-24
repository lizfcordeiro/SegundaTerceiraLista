package QuestoesDaSegundaLista;

import java.util.Scanner;

public class SextaQuestao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 4 números ");
        double num1 = teclado.nextDouble();
        double num2 = teclado.nextDouble();
        double num3 = teclado.nextDouble();
        double num4 = teclado.nextDouble();

        double soma1 = num1 * num1;
        double soma2 = num2 * num2;
        double soma3 = num3 * num3;
        double soma4 = num4 * num4;

        double total = soma1 + soma2 + soma3 + soma4;

        System.out.println(total);
    }
}
