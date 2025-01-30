package Produtos;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProdutoRepositorio {
    Scanner leitura = new Scanner(System.in);
    List<Produto> produtos = new ArrayList<Produto>();


    public void cadastrarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    public boolean removerProdutoPorCodigo(int codigo) {
        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigo) {
                produtos.remove(produto);
                System.out.println("");
                System.out.println("Produto removido com sucesso! \n");

                return true;
            }
        }
        return false;
    }


    public void listarProdutosPorNome() {
        produtos.stream()
                .sorted(Comparator.comparing(Produto::getNome))
                .forEach(System.out::println);

    }


    public void listarProdutosPorPreco() {
        produtos.stream()
                .sorted(Comparator.comparing(Produto::getPreco))
                .forEach(System.out::println);
    }

    public void buscarNaLista() {
        System.out.println("Digite o nome do produto");
        String nomeBuscado = leitura.nextLine().trim();
        boolean produtoEncontrado = false;

        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nomeBuscado)) {
                produtoEncontrado = true;
                System.out.println(produto);
            }
        }
        if (!produtoEncontrado) {
            System.out.println(nomeBuscado + " Produto não encontrado");
        }
    }

    public void listarProdutosDisponiveis() {
        boolean produtoEncontrado = false;
        System.out.println("Produtos Disponiveis: \n");
        for (Produto produto : produtos) {

            if (produto.isDispnivel()) {
                System.out.println(produto);
                produtoEncontrado = true;
                break;
            }
        }
        if (!produtoEncontrado) {
            System.out.println("Nenhum produto disponivel.");
        }
    }

    public void buscarNaListaStream() {
        System.out.println("Digite o nome do produto");
        String nomeBuscado = leitura.nextLine().trim();

        produtos.stream()
                .filter(produto -> produto.getNome().equalsIgnoreCase(nomeBuscado))
                .findFirst()
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println(nomeBuscado + " Produto não encontrado.")
                );


    }
}
