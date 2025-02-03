import Produtos.Produto;
import Produtos.ProdutoRepositorio;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ProdutoRepositorio produtoRepositorio = new ProdutoRepositorio();
        Produto p1 = new Produto(1, "Arroz Branco", 1500, true);
        Produto p2 = new Produto(2, "Arroz Preto", 500, true);
        Produto p3 = new Produto(3, "Arroz Verde", 350, false);
        Produto p4 = new Produto(4, "Teclado", 550, true);
        Produto p5 = new Produto(5, "Microfone", 250, true);
        Produto p6 = new Produto(6, "Webcam", 450, true);

        produtoRepositorio.cadastrarProduto(p1);
        produtoRepositorio.cadastrarProduto(p2);
        produtoRepositorio.cadastrarProduto(p3);
        produtoRepositorio.cadastrarProduto(p4);
        produtoRepositorio.cadastrarProduto(p5);
        produtoRepositorio.cadastrarProduto(p6);

        //System.out.println("Produtos listados!\n");

        //produtoRepositorio.listarProdutos();

        //boolean resultado = produtoRepositorio.removerProdutoPorCodigo(4);
       // boolean resultado2 = produtoRepositorio.removerProdutoPorCodigo(5);

        System.out.println("");
        System.out.println("Produtos listados por nome\n");
        produtoRepositorio.listarProdutosPorNome();
        //System.out.println("");
        //System.out.println("Produtos listado por preços \n");
        //produtoRepositorio.listarProdutosPorPreco();
        //System.out.println("");

        //produtoRepositorio.buscarNaLista();
        //produtoRepositorio.listarProdutosDisponiveis();
        //produtoRepositorio.buscarNaListaStream();
        produtoRepositorio.listarProdutosDisponiveis2();


    }
}