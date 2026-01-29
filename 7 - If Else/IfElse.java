public class IfElse {
    public static void main (String[] args){
        boolean chovendo = true;
        boolean tem_guardachuva = true;
        boolean frio = true;
        String texto;

        if (chovendo){
            if (tem_guardachuva){
                System.out.println("Esta chovendo, porem voce esta protegido da chuva!");
                texto = (frio == true) ? "Esta frio, coloque uma blusa. Bom passeio!" : "Bom passeio!";
                System.out.println(texto);
            } else {
                System.out.println("Esta chovendo, e agora nao tera como sair...");
            }
        } else {
            System.out.println("Nao esta chovendo!");
            texto = (frio == true) ? "Esta frio, coloque uma blusa. Bom passeio!" : "Bom passeio!";
            System.out.println(texto);
        }
    }
}
