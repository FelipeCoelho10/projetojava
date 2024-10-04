public class Main {
    public static void main(String[] args) {
        Mesa mesa1 = new Mesa(1);
        Mesa mesa2 = new Mesa(2);

        // Usando mesa1
        mesa1.ocuparMesa();
        mesa1.ocuparMesa();

        // Usando mesa2
        mesa2.ocuparMesa(); 

        PedidoBar pedido1 = new PedidoBar(101);

        ItemDoPedido item1 = new ItemDoPedido("Pizza", 25.0, 2);
        ItemDoPedido item2 = new ItemDoPedido("Refrigerante", 5.0, 3);
        pedido1.adicionarItem(item1);
        pedido1.adicionarItem(item2);

        System.out.println("Total do pedido: R$ " + pedido1.calcularTotal());

        mesa1.liberarMesa();
        mesa2.liberarMesa(); 
    }
}
