package QuestoesDaTerceiraLista;

import java.util.Scanner;

public class DecimaPrimeiraQuestao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite dois número ");
        int primeiroNumero = teclado.nextInt();
        int segundoNumero = teclado.nextInt();
        int index = 0;

        if (primeiroNumero > segundoNumero){
            index = segundoNumero;
            for (int i = index + 1; i < primeiroNumero; i++){
                System.out.println(i);
            } }
        else {
                index = primeiroNumero;
                for (int i = index + 1; i < segundoNumero; i++){
                    System.out.println(i);
                }
            }
        }
    }

