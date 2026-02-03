public class Aluno {
    private String nome;
    private Double nota;
    private String usuario;
    private String senha;

    public Aluno (String nome, Double nota, String usuario, String senha){
        this.nome = nome;
        this.nota = nota;
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public Double getNota() {
        return nota;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }
}
