public class ItemDoPedido {
    // Atributos de um item do pedido
    private final String nome; 
    private final double preco; 
    private final int quantidade; 

    // Construtor para inicializar um item do pedido
    public ItemDoPedido(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Métodos getters para acessar o preço, a quantidade e o nome do item
    public String getNome() {
        return nome; 
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
