import java.util.ArrayList;

public class praticaArrayList {
    public static void main (String[] args){
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Jorge");

        for (String nome : nomes){
            System.out.println(nome);
        }

        System.out.println();
        nomes.remove(2);

        for (String nome : nomes){
            System.out.println(nome);
        }
    }
}
