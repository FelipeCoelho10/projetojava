
public class Medico {

    private final String nome; // Nome do médico
    private final String especialidade; // Especialidade do médico
    private boolean disponibilidade; // Disponibilidade do médico

    // Construtor para inicializar os atributos do Médico
    public Medico(String nome, String especialidade, boolean disponibilidade) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.disponibilidade = disponibilidade;
    }

    // Método getter para obter o nome do médico
    public String getNome() {
        return nome;
    }

    // Método getter para obter a especialidade do médico
    public String getEspecialidade() {
        return especialidade;
    }

    // Método para verificar se o médico está disponível para consultas
    public boolean verificarDisponibilidade() {
        return disponibilidade;
    }

    // Método para agendar uma consulta, marcando o médico como ocupado se disponível
    public void agendarConsulta() {
        if (disponibilidade) {
            disponibilidade = false; // Marcar como ocupado
            System.out.println("Consulta agendada com o Dr. " + nome);
        } else {
            System.out.println("Médico não disponível.");
        }
    }
}
