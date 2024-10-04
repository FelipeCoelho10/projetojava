
public class Paciente {

    private final String nome; // Nome do paciente
    private final int idade; // Idade do paciente
    private String historicoMedico; // Histórico médico do paciente

    // Construtor para inicializar os atributos do Paciente
    public Paciente(String nome, int idade, String historicoMedico) {
        this.nome = nome;
        this.idade = idade;
        this.historicoMedico = historicoMedico;
    }

    // Método getter para obter o nome do paciente
    public String getNome() {
        return nome;
    }

    // Método getter para obter a idade do paciente
    public int getIdade() {
        return idade;
    }

    // Método getter para obter o histórico médico do paciente
    public String getHistoricoMedico() {
        return historicoMedico;
    }

    // Método para atualizar o histórico médico do paciente
    public void atualizarHistorico(String novoHistorico) {
        this.historicoMedico = novoHistorico;
    }
}
