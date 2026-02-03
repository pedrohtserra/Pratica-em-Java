import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner leitor = new Scanner(System.in);
        String usuarioScan;
        String senhaScan;
        boolean logou = false;

        List<Aluno> listaAlunos = new ArrayList<>();
        listaAlunos.add(new Aluno("Pedro", 9.5, "pedro321", "pedro123"));
        listaAlunos.add(new Aluno("Maria", 10.0, "maria456", "senha456"));
        listaAlunos.add(new Aluno("Jose", 7.0, "jose789", "senha789"));

        System.out.print("Digite seu usuario: ");
        usuarioScan = leitor.nextLine();

        System.out.print("Digite sua senha: ");
        senhaScan = leitor.nextLine();
        for (Aluno aluno : listaAlunos){
            if (usuarioScan.equals(aluno.getUsuario()) && senhaScan.equals(aluno.getSenha())){
                System.out.println("Ola, " + aluno.getNome() + "!");
                System.out.println("Sua nota: " + aluno.getNota());
                logou = true;
                break;
            }
        }

        if (!logou){
            System.out.println("Usuario ou senha incorretos.");
        }
    }
}