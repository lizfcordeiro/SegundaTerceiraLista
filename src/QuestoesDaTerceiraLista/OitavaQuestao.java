package QuestoesDaTerceiraLista;
import java.util.Scanner;
public class OitavaQuestao {
    public static void main(String[] args) {
        int soma = 0, maior, menor;
        System.out.println("Digite 10 números ");
        Scanner scanner = new Scanner(System.in);
        int primeiro = scanner.nextInt();
        maior = primeiro;
        menor = primeiro;
        soma = soma + primeiro;
        for (int i = 0; i < 9; i++) {
            Scanner teclado = new Scanner(System.in);
            int numero = teclado.nextInt();
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
            soma = soma + numero;
        }
        int media = soma / 10;
        System.out.println("O maior número é " + maior);
        System.out.println("O menor número é " + menor);
        System.out.println("A média de todos os números é " + media);
    }

}

