package produto;

public class Produtos {

    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produtos(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
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
        if(preco > 0){
            this.preco = preco;
            System.out.println("valor compativel");
        } else {
            System.out.println("alerta, valor incompativel");
        }
    }

    public int getQuantidadeestoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeestoque(int quantidadeestoque) {
        this.quantidadeEstoque = quantidadeestoque;
    }

    public void adicionarEstoque(int quantidade) {
        quantidadeEstoque += quantidade;
    }

    public void removerEstoque(int quantidade) {
        if(quantidade <= quantidadeEstoque) {
            System.out.println("remocao liberada");
            quantidadeEstoque -= quantidade;
        } else {
            System.out.println("remocao negada");
        }
    }

    public double calcularValorTotalEstoque() {
        return preco * quantidadeEstoque;
    }

    @Override
    public String toString() {
        return "Produto: " + nome +
                " | preco: " + preco +
                " | estoque: " + quantidadeEstoque +
                " | valor total: " + calcularValorTotalEstoque();

    }
}
