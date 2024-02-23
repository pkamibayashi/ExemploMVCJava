package exemplo.app;

import exemplo.controller.AlunoController;
import exemplo.repository.impl.AlunoRepositoryInMemoryImpl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // A responsa. de encontrar o tipo de impl esta delegado a camada mais alta da minha aplicacao.
        // No caso, na minha classe main
        // Porem isso poderia estar em uma factory

                                                         // Aqui estou definindo o timpo da implementacao que eu quero
        AlunoController controller = new AlunoController(new AlunoRepositoryInMemoryImpl());


        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = sc.nextLine();
        ...
        ...
    }

}
