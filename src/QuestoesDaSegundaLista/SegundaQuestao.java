package QuestoesDaSegundaLista;

import java.util.Scanner;

public class SegundaQuestao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escreva seu nome completo ");
        String nomeCompleto = teclado.nextLine();
        System.out.println("Informe seu endereço ");
        String endereco = teclado.nextLine();
        System.out.printf("Informe o CEP ");
        String cep = teclado.nextLine();
        System.out.printf("Informe o telefone ");
        String telefone = teclado.nextLine();
        System.out.println("O nome completo é " + nomeCompleto);
        System.out.println("O endereço é " + endereco);
        System.out.println("O CEP é " + cep + " o telefone é " + telefone);
    }
}
