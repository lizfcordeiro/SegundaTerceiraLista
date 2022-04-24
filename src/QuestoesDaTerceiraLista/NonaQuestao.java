package QuestoesDaTerceiraLista;

import java.util.Scanner;

public class NonaQuestao {
    public static void main(String[] args) {
        int pessoasMaioresDeDezoito = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 10 idades ");

        for (int i = 0; i <= 10; i++){
            int numero = teclado.nextInt();
            if (numero > 18){
                pessoasMaioresDeDezoito++;
            }
        }
        System.out.println(pessoasMaioresDeDezoito);
    }
}
