package QuestoesDaSegundaLista;

import java.util.Scanner;

public class PrimeiraQuestao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o nome do aluno ");
        String nomeDoAluno = teclado.nextLine();
        System.out.println("Informe a turma do aluno ");
        String nomeDaTurma = teclado.nextLine();
        System.out.println("Informe as notas 3 dos alunos ");
        double nota1 = teclado.nextDouble();
        double nota2 = teclado.nextDouble();
        double nota3 = teclado.nextDouble();
        double media = (nota1 + nota2 + nota3)/3;
        System.out.println("A média do " + nomeDoAluno + " é " + media);
    }
}
