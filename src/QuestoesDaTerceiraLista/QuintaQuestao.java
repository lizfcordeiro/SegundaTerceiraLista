package QuestoesDaTerceiraLista;

import java.util.Scanner;

public class QuintaQuestao {
    public static void main(String[] args) {
        double imc;
        System.out.println("Digite o nome de 1 pessoas e suas respectivas altura e peso ");
        Scanner teclado = new Scanner(System.in);
            double altura = teclado.nextDouble();
            double peso = teclado.nextDouble();
        imc = peso / (altura*altura);
        if (imc > 18.5 || imc > 25) {
            System.out.println("Peso ideal " + imc);
            } else if(imc < 18.5){
        System.out.println("Abaixo do peso " + imc);
        } else if(imc > 25 || imc < 29.9) {
        System.out.println("Execesso de peso " + imc);
    } else if(imc > 30) {
        System.out.println("Obeso " + imc);
    }
}
}
