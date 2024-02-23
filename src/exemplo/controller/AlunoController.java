package exemplo.controller;

import exemplo.dto.AlunoDTO;
import exemplo.model.Aluno;
import exemplo.repository.AlunoRepository;
// REGRAS DO CONTROLLER
// - ELe nao saber detalhes da minha aplicacao a nivel de negocios
// - Ele nao deve saber como salva no banco de dados
// - Controller nem deve saber sobre nada do sistema


// Para meu controller fazer qualquer uma dessas ações "CRUD"
// ele precisa ter acesso ao repository
public class AlunoController {

    // Uma dependencia do controller, é o repository
    // A implementacao do repository nao importa pro meu controller
    private AlunoRepository alunoRepository;


    // Inicializando o controller com o repository
    public AlunoController(AlunoRepository alunoRepository){
        this.alunoRepository = alunoRepository;
    }

    public void executar(String command, AlunoDTO dto){
        if("inserir".equals(command)){
            Aluno aluno = alunoRepository.inserir(dto.toAluno());
            System.out.println("Aluno inserido com sucesso: " + aluno);
        }

        if("alterar".equals(command)){
            // implementar depois
        }

        if("excluir".equals(command)){
            // implementar depois
    }
    }
}
