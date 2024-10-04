
public class Participante {

    // Atributos de um participante
    private final String nome;
    private final String contato;

    // Construtor para inicializar um participante
    public Participante(String nome, String contato) {
        this.nome = nome;
        this.contato = contato;
    }

    // Método getter para acessar o nome do participante
    public String getNome() {
        return nome;
    }

    // Método getter para acessar o contato do participante
    public String getContato() {
        return contato;
    }
}
