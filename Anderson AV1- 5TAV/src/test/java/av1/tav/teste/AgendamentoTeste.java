package av1.tav.teste;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.Test;

import av1.tav.Agendamento;
import av1.tav.Funcionario;
import av1.tav.Medico;

public class AgendamentoTeste {
	// Testando se o funcionário possui plano de saúde
	@Test
	public void VerificarPlano() {
		
		Funcionario Funcionario = new Funcionario();

		int id = 3;
		String nome = "Marcus";
		String dispoePlano = "Sim";

		// Dados do funcionário
		String esperado = "ID do Funcionário:" + id + "\n" + "Nome do funcionário:" + nome + "\n" + "Usufrui do plano: "
				+ dispoePlano;

		String resultado = Funcionario.carteirinhaFuncionario(id, nome, true);

		assertEquals(esperado, resultado);
	}

	// Testando a marcação de consultas:
	
	@Test
	public void MarcarConsultaEndocrinologista() {

		Agendamento agendando = new Agendamento();
		String esperado = "Consulta marcada com êxito !!";

		LocalTime hora = LocalTime.of(5, 0);
		LocalDate data = LocalDate.of(2021, 11, 25);

		Medico<String, String> doutor = Medico.Endocrinologista();

		String resultado = agendando.Consulta(1, doutor.getKey(), doutor.getValue(), 1, hora, data);

		assertEquals(resultado, esperado);
	}
	
	@Test
	public void MarcarConsultaNutricionista() {

		Agendamento agendando = new Agendamento();
		String esperado = "Consulta marcada com êxito !!";

		LocalTime hora = LocalTime.of(18, 0);
		LocalDate data = LocalDate.of(2022, 03, 21);

		Medico<String, String> doutor = Medico.Nutricionista();

		String resultado = agendando.Consulta(2, doutor.getKey(), doutor.getValue(), 2, hora, data);

		assertEquals(resultado, esperado);
	}

	@Test
	public void MarcarConsultaFisioterapeuta() {

		Agendamento agendando = new Agendamento();
		String esperado = "Consulta marcada com êxito !!";

		LocalTime hora = LocalTime.of(8, 0);
		LocalDate data = LocalDate.of(2022, 04, 15);

		Medico<String, String> doutor = Medico.Fisioterapeuta();

		String resultado = agendando.Consulta(3, doutor.getKey(), doutor.getValue(), 3, hora, data);

		assertEquals(resultado, esperado);
	}

	@Test
	public void MarcarConsultaNeurologista() {

		Agendamento agendando = new Agendamento();
		String esperado = "Consulta marcada com êxito !!";

		LocalTime hora = LocalTime.of(15, 0);
		LocalDate data = LocalDate.of(2022, 04, 27);

		Medico<String, String> doutor = Medico.Neurologista();

		String resultado = agendando.Consulta(4, doutor.getKey(), doutor.getValue(), 4, hora, data);

		assertEquals(resultado, esperado);
	}

	// Teste de internação
	@Test
	public void MarcarInternacao() {

		Agendamento agendando = new Agendamento();
		String esperado = "Internação realizada com êxito !!";

		LocalTime hora = LocalTime.of(7, 0);
		LocalDate data = LocalDate.of(2021, 11, 16);

		Medico<String, String> doutor = Medico.Internacao();

		String resultado = agendando.Internacao(1, doutor.getKey(), doutor.getValue(), 1, hora, data);

		assertEquals(resultado, esperado);
	}

	// Teste de exame
	@Test
	public void MarcarExame() {

		Agendamento agendando = new Agendamento();
		String esperado = "Exame marcado com êxito !!";

		LocalTime hora = LocalTime.of(9, 0);
		LocalDate data = LocalDate.of(2021, 11, 23);

		Medico<String, String> doutor = Medico.Laboratorio();

		String resultado = agendando.Exame(1, doutor.getKey(), doutor.getValue(), 1, hora, data);

		assertEquals(resultado, esperado);
	}

}
