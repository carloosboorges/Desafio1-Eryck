package Produtos;

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

                listarProdutos();
                return true;
            }
        }
        return false;
    }


    Comparator<Produto> compararPorNome = new Comparator<Produto>() {

        @Override
        public int compare(Produto p1, Produto p2) {
            return p1.getNome().compareTo(p2.getNome());
        }
    };

    public void listarProdutosPorNome() {
        produtos.sort(compararPorNome);
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    Comparator<Produto> compararPorPreco = new Comparator<Produto>() {
        public int compare(Produto p1, Produto p2) {
            return Double.compare(p1.getPreco(), p2.getPreco());
        }
    };

    public void listarProdutosPorPreco() {
        produtos.sort(compararPorPreco);
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
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
}