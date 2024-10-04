
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // Criação de um novo paciente
        Paciente paciente = new Paciente("João Silva", 30, "Alergia a penicilina");

        // Criação de um novo médico
        Medico medico = new Medico("Dr. Pedro", "Cardiologia", true);

        // Verifica a disponibilidade do médico antes de agendar a consulta
        if (medico.verificarDisponibilidade()) {
            medico.agendarConsulta(); // Agendamento da consulta

            // Criação de uma nova consulta com a data atual
            Consulta consulta = new Consulta(new Date(), medico, paciente);
            consulta.realizarConsulta(); // Realiza a consulta
        }
    }
}
