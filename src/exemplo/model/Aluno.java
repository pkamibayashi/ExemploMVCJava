package exemplo.model;

public class Aluno {
    private String nome;
    private String email;

    private Long id;

    public Aluno(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    // ate aqui tenho minha classe aluno e seu construtor
    // Como tenho construtor, preciso de setter e getter

    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public void setEmail(String email) {
        this.email = email;
    }

}
