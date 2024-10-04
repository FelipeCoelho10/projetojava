import java.util.Date;
import java.text.SimpleDateFormat;

public class Consulta {
    private Date dataHora;
    private Medico medico;
    private Paciente paciente;

    public Consulta(Date dataHora, Medico medico, Paciente paciente) {
        this.dataHora = dataHora;
        this.medico = medico;
        this.paciente = paciente;
    }

    public void realizarConsulta() {
        // Formata a data para um formato mais legível
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String dataFormatada = formatoData.format(dataHora);
        
        // Exibe as informações da consulta
        System.out.println("Consulta realizada com o " + medico.getNome() + " para o paciente " + paciente.getNome() + " na data " + dataFormatada);
    }
}
