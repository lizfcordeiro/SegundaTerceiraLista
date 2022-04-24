package QuestoesDaTerceiraLista;


public class TerceiraQuestao {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            if (i % 10 == 0){
                System.out.println("O número é multiplo de 10 " + i);
            }
        }
    }
}
