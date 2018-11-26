package sistemaestoque;

/**
 *
 * @author Diana
 * @author Carla
 */
class Produto {
    private final int id;
    private String nome;
    private String descricao;
    private int quantidade;
    private double preco;
    private static int contador = 0;

    public Produto(String nome, String descricao, int quantidade, double preco) {
        contador++;
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
        this.id = contador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public static int getContador() {
        return contador;
    }
    
}
