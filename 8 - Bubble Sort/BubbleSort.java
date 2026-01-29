import java.util.Arrays;

public class BubbleSort {
    public static void main (String[] args){
        int[] lista = {4, 3, 5, 1, 2};
        int aux;

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4 - i; j++){
                if (lista[j + 1] < lista[j]){
                    aux = lista[j + 1];
                    lista[j + 1] = lista[j];
                    lista[j] = aux;
                }
            }
        }

        System.out.println(Arrays.toString(lista));
    }
}
