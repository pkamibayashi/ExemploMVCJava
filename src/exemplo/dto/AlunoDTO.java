package exemplo.dto;

import exemplo.model.Aluno;


public record AlunoDTO(Long id, String nome, String email) {

    public Aluno toAluno() {
        return new Aluno(nome, email);
    }

}
