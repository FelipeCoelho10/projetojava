import java.util.ArrayList;

public class PedidoBar {
    // Atributos de um pedido
    private final int numeroPedido; // Agora é final
    private final ArrayList<ItemDoPedido> itens; // Agora é final
    private double total;

    // Construtor para inicializar um pedido
    public PedidoBar(int numeroPedido) {
        this.numeroPedido = numeroPedido; 
        this.itens = new ArrayList<>(); // Lista para armazenar os itens do pedido
        this.total = 0; // Total inicial é zero
    }

    // Método para adicionar um item ao pedido
    public void adicionarItem(ItemDoPedido item) {
        itens.add(item); // Adiciona o item à lista de itens do pedido
        total += item.getPreco() * item.getQuantidade(); // Atualiza o total
    }

    // Método para calcular o total do pedido
    public double calcularTotal() {
        return total;
    }
    
    // Método para obter o número do pedido
    public int getNumeroPedido() {
        return numeroPedido;
    }
}
