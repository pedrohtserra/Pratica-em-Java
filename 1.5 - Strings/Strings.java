public class Strings {
    public static void main (String[] args){
        String texto = "Procure meu Index";
        String txt1 = "Pedro";
        String txt2 = "Marcos";
        String txt3 = "Pedro";
        String hello = "    Hello   ";

        System.out.println(texto.indexOf("Index")); // Printa o índice
        System.out.println(texto.charAt(0)); // Printa o primeiro char da string
        System.out.println(txt1.equals(txt2)); // Printa false (não é igual)
        System.out.println(txt1.equals(txt3)); // Printa true (é igual)
        System.out.println('[' + hello.trim() + ']'); // O trim remove os espaços em branco
    }
}
