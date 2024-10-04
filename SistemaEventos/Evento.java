
import java.util.ArrayList;

public class Evento {

    // Atributos do evento
    private final String nome; // Definido como final
    private final String data; // Definido como final
    private final Local local; // Definido como final
    private final ArrayList<Participante> participantes; // Definido como final

    // Construtor para inicializar um evento
    public Evento(String nome, String data, Local local) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.participantes = new ArrayList<>();
    }

    // Método para cadastrar participantes em um evento, respeitando a capacidade do local
    public void cadastrarParticipante(Participante participante) {
        if (participantes.size() < local.getCapacidade()) {
            participantes.add(participante);
            System.out.println("Participante " + participante.getNome() + " cadastrado no evento " + nome);
        } else {
            System.out.println("Evento lotado.");
        }
    }

    // Método para gerar um relatório com a lista de participantes do evento
    public void gerarRelatorio() {
        System.out.println("Relatório do evento " + nome);
        for (Participante p : participantes) {
            System.out.println("Participante: " + p.getNome());
        }
    }

    // Método getter para acessar a data do evento
    public String getData() {
        return data;
    }
}
