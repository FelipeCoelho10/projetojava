
public class Main {

    public static void main(String[] args) {
        Local local = new Local("Rua das Flores, 123", 5); // Capacidade para 5 participantes

        Evento evento = new Evento("Festival de Música", "10/10/2024", local);

        Participante participante1 = new Participante("Alice", "alice@example.com");
        Participante participante2 = new Participante("Bob", "bob@example.com");
        Participante participante3 = new Participante("Carlos", "carlos@example.com");
        Participante participante4 = new Participante("Diana", "diana@example.com");
        Participante participante5 = new Participante("Eduardo", "eduardo@example.com");
        Participante participante6 = new Participante("Fernanda", "fernanda@example.com");

        evento.cadastrarParticipante(participante1);
        evento.cadastrarParticipante(participante2);
        evento.cadastrarParticipante(participante3);
        evento.cadastrarParticipante(participante4);
        evento.cadastrarParticipante(participante5);
        evento.cadastrarParticipante(participante6);

        evento.gerarRelatorio();
    }
}
