public class Methods {

    static void digaOla (String nome){
        System.out.println("Ola, " + nome + "!");
    }

    static int calcular (int x, int y){
        return x + y;
    }

    static int recursao (int n){
        if (n > 0){
            return n + recursao(n - 1);
        } else {
            return 0;
        }
    }

    public static void main (String[] args){
        String nome = "Pedro";
        int x = 10;
        int y = 5;

        digaOla(nome);
        System.out.println(calcular(x, y));

        int resultado = recursao(10);
        System.out.println(resultado);
    }
}
