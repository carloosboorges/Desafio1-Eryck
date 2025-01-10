package Produtos;

public class Produto {

    private int codigo;
    private String nome;
    private double preco;
    private boolean dispnivel;


    public Produto(int codigo, String nome, double preco, boolean dispnivel) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.dispnivel = dispnivel;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isDispnivel() {
        return dispnivel;
    }

    public void setDispnivel(boolean dispnivel) {
        this.dispnivel = dispnivel;
    }

    @Override
    public String toString() {
        return "Produto = " +
                "Codigo = " + codigo +
                " - Nome = " + nome  +
                " - Preço = " + preco +
                " - Disponivel = " + dispnivel;
    }
}
