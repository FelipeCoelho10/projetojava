
public class Local {

    // Atributos de um local
    private final String endereco; // 
    private final int capacidade; // 

    // Construtor para inicializar um local
    public Local(String endereco, int capacidade) {
        this.endereco = endereco;
        this.capacidade = capacidade;
    }

    // Método getter para acessar a capacidade do local
    public int getCapacidade() {
        return capacidade;
    }

    // Método getter para acessar o endereço do local
    public String getEndereco() {
        return endereco;
    }
}
