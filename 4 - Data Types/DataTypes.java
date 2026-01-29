public class DataTypes {
    public static void main (String[] args){
        String nome = "Pedro";
        int a = 5; // -2,147,483,648 até 2,147,483,647
        float b = 5.5f;
        char c = 'C';
        boolean booleano = true;
        byte byteNum = 100; // -128 até 127
        short shortNum = 10000; // -32768 até 32767
        long longNum = 100000000000L; // -9223372036854775808 até 9223372036854775807
        double doubleNum = 10.11d;
        var varNum = 10; // O compilador detecta automáticamente o tipo da variável, porém não é possível trocar o tipo, como por exemplo: varNum = 10.5f;

        System.out.println(nome);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(booleano);
        System.out.println(byteNum);
        System.out.println(shortNum);
        System.out.println(longNum);
        System.out.println(doubleNum);
        System.out.println(varNum);
    }
}