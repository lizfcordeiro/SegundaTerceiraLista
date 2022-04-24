package QuestoesDaTerceiraLista;

import java.util.Scanner;

public class DecimaSegundaQuestao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu nome ");
        String nome = teclado.nextLine();
        if (nome.length() < 3) {
            System.out.println("Nome inválido, necessário ter mais de 3 letras ");
        }
        System.out.println("Digite sua idade ");
        int idade = teclado.nextInt();
        teclado.nextLine();
        if (idade < 0 || idade > 150) {
            System.out.println("Sua idade deve ser maior que 0 e menor que 150");
        }
        System.out.println("Digite seu sexo, F para feminino e M para masculino");
        String sexo = teclado.nextLine();
        if (sexo.equals("M") || sexo.equals("F")) {
        } else {
            System.out.println("Digite M ou F ");
        }
        System.out.println("Digite seu estado civil, S para solteira, C para casada, V para viuva e " +
                "D para divorciada ");
        String estadoCivil = teclado.nextLine();
        if (estadoCivil.equals("S") || estadoCivil.equals("C") || estadoCivil.equals("V")  || estadoCivil.equals("D")) {
        } else {
            System.out.println("Digite S, C, V ou D ");
        }
    }
}
