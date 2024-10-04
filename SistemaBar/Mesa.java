// Mesa.java
public class Mesa {
    // Atributos de uma mesa
    private final int numero; 
    private boolean ocupada;

    // Construtor para inicializar uma mesa
    public Mesa(int numero) {
        this.numero = numero; 
        this.ocupada = false; 
    }

    // Método para ocupar uma mesa
    public boolean ocuparMesa() {
        if (!ocupada) {
            ocupada = true;
            System.out.println("Mesa " + numero + " ocupada.");
            return true;
        } else {
            System.out.println("Mesa já está ocupada.");
            return false;
        }
    }

    // Método para liberar uma mesa
    public void liberarMesa() {
        ocupada = false;
        System.out.println("Mesa " + numero + " liberada.");
    }
}
