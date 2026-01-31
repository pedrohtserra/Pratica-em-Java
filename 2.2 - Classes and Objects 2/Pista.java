public class Pista {
    public static void main (String[] args){
        Carro novoCarro = new Carro("BMW");
        novoCarro.acelerar();
    }
}

class Carro {
    String modelo;

    public Carro(String modelo){
        this.modelo = modelo;
    }

    public void acelerar(){
        System.out.println("Acelerando o carro " + this.modelo);
    }
}