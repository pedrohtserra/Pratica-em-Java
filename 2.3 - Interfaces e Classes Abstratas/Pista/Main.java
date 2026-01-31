package Pista;

public class Main {
    public static void main (String[] args){
        Carro novoCarro = new Sandero();
        Carro novoCarro2 = new Mobi();

        SerVivo novaPessoa = new Humano();
        novaPessoa.respirar();

        novoCarro.acelerar();
        novoCarro2.acelerar();
    }
}
