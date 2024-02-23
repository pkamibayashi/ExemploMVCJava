package exemplo.repository;

import java.util.List;
import exemplo.model.Aluno;

// Classes que sabemos que pode ter a chance de ter uma
// implementação, uma mudança, uma forma de trabalhar diferente
// Classes que sabemos que pode ter uma mudança de comportamento
// Mesmo que seja uma possibilidade fraca de existir
// Trabalhamos orientados a interface
// Pois quando essas mudanças surgirem, podemos fazer alterações
// Sem mecher no nosso programa, ou melhor, da menor forma possivel.
public interface AlunoRepository {
    // Aqui dentro vou "Declarar todos os metodos do aluno
    // Apenas declarar, não implementar.
    public Aluno inserir(Aluno a);

    public Aluno altera(Aluno a);

    public Aluno excluir(Aluno a);

    public List<Aluno> pesquisaPorNome(String nome);

    public List<Aluno> pesquisaPorEmail(String email);

    // Aqui eu nao estou me importando que tipo de implementação
    // vai acontecer, estou apenas desenhando o conceito do que minha
    // aplicacao vai fazer, sem me preocupar com a implementacao.
    // Isso é o que chamamos de "Programar voltado a interface"
    // Pensar dessa forma é o mais saudavel pois ganhamos tempo
    // sem se preocupar com a implementacao.
    // a implementacao é feita na proxima parte.
    // Isso garante flexibilidade, extensabilidade e etc.

}
