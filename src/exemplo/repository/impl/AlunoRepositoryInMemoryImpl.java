package exemplo.repository.impl;

import exemplo.repository.AlunoRepository;
import exemplo.model.Aluno;
import java.util.ArrayList;
import java.util.List;

public class AlunoRepositoryInMemoryImpl implements AlunoRepository {

    // Essa classe AlunoRepositoryInMemoryImpl salva tudo o que ela tem que salvar
    // Dentro de uma Lista em memoria
    private List<Aluno> alunos = new ArrayList<Aluno>();

    // Entao esse inserir, faz o que ?
    // Ele pega o aluno que foi passado como parametro e adiciona na lista
    @Override
    public Aluno inserir(Aluno a) {
        alunos.add(a);
        a.setId(Long.valueOf(alunos.size()));
        return a;
    }

    @Override
    public Aluno altera(Aluno a) {
        return null;
    }

    @Override
    public Aluno excluir(Aluno a) {
        return null;
    }

    @Override
    public List<Aluno> pesquisaPorNome(String nome) {
        List<Aluno> alunosEncontrados = new ArrayList<Aluno>();
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equals(nome)) {
                alunosEncontrados.add(aluno);
            }
        }
        return alunosEncontrados;
    }

    @Override
    public List<Aluno> pesquisaPorEmail(String email) {
        List<Aluno> emailsEncontrados = new ArrayList<Aluno>();
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equals(email)) {
                emailsEncontrados.add(aluno);
            }
        }
        return emailsEncontrados;
    }
    }
}
