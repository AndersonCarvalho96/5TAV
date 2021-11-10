package av1.tav;

import java.time.LocalDate;
import java.time.LocalTime;

public class Agendamento {
	
	public String endereco;
	public String medicoNome;
	public LocalTime hora;
	public LocalDate agendamentoData;
	public int idAgendam;
	public int idFuncio;

	

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public LocalDate getAgendamentoData() {
		return agendamentoData;
	}

	public void setAgendamentoData(LocalDate agendamentoData) {
		this.agendamentoData = agendamentoData;
	}

	public int getIdFuncio() {
		return idFuncio;
	}

	public void setIdFuncio(int idFuncio) {
		this.idFuncio = idFuncio;
	}
	public int getIdAgendam() {
		return idAgendam;
	}

	public void setIdAgendam(int idAgendam) {
		this.idAgendam = idAgendam;
	}

	// Verificando se a consulta foi marcada com êxito
	public String Consulta(int idAgendam, String medicoNome, String endereco, int idFuncio, LocalTime hora,
			LocalDate agendamentoData) {
		
			return "Consulta marcada com êxito !!"; 
	}

	// Verificando se o exame foi marcado com êxito
	public String Exame(int idAgendam, String medicoNome, String endereco, int idFuncio, LocalTime hora,
			LocalDate agendamentoData) {
		
			return "Exame marcado com êxito !!"; 
	}

	// Verificando se a internação foi realizada com êxito
	public String Internacao(int idAgendam, String medicoNome, String endereco, int idFuncio, LocalTime hora,
			LocalDate agendamentoData) {
		
			return "Internação realizada com êxito !!"; 
	}
}
