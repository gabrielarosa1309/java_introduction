import com.sun.source.tree.WhileLoopTree;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Livro> listaLivro = new ArrayList<Livro>();
        Livro metodoLivro = new Livro();

        System.out.println("Bem vindo ao sistema de cadastro do nosso sebo!");

        Scanner leitor = new Scanner(System.in);

        String opcao;

        do {
            System.out.println("Escolha uma opção: 1 - Cadastrar livro / 2 - Listar Livro / 0 - Voltar");
            opcao = leitor.nextLine();

            switch (opcao) {

                case "1":

                    Livro novoLivro = new Livro();
                    Autor novoAutor = new Autor();

                    System.out.println("Digite o titulo: ");
                    novoLivro.titulo = leitor.nextLine();

                    System.out.println("Digite o preço do livro: ");
                    novoLivro.preco = Float.valueOf(leitor.nextLine());

                    System.out.println("Digite a data de publicação do livro: ");
                    novoLivro.datalancamento = LocalDate.parse(leitor.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                    Period idade = Period.between(novoLivro.datalancamento, LocalDate.now());

                    if (idade.getYears() >= 5) {
                        System.out.println();
                    } else {
                        System.out.println("Este livro não pode ser cadastrado devido sua data de lançamento :(");
                        break;
                    }


                    System.out.println("Digite o nome do autor; ");
                    novoAutor.nomeAutor = leitor.nextLine();

                    System.out.println("Digite o local de nascimento do autor: ");
                    novoAutor.LocalNasc = leitor.nextLine();

                    novoLivro.autor = novoAutor;

                    listaLivro.add(novoLivro);

                    System.out.println("Cadastro realizado com suceso :)");

                    break;

                case "2":

                    if (listaLivro.size() > 0) {

                        for (Livro cadalivro : listaLivro) {
                            System.out.println("Titulo: " + cadalivro.titulo);
                            System.out.println("Preço: " + cadalivro.preco);
                            System.out.println("Data de lançamento: " + cadalivro.datalancamento);
                            System.out.println("Autor: " + cadalivro.autor.nomeAutor);
                            System.out.println("Local de nascimento: " + cadalivro.autor.LocalNasc);

                            System.out.println();
                            System.out.println("Aperte Enter para continuar");
                            leitor.nextLine();
                        }
                    } else {
                        System.out.println("Esta lista não contém nenhum livro ainda :(");
                    }
                    break;

                case "0":
                    System.out.println("Até breve!");
                    break;

                default:
                    System.out.println("Por favor, digite uma operação válida!");
                    break;

            }


        } while (!opcao.equals("0"));

    }
}