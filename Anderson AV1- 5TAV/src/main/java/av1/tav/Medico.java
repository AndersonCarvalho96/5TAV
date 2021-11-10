package av1.tav;

public class Medico<D1, D2> {
	public final D1 nome;
	public final D2 endereco;

	public Medico(D1 mnome, D2 mendereco) {
		this.nome = mnome;
		this.endereco = mendereco;
	}

	public D1 getKey() {
		return nome;
	}

	public D2 getValue() {
		return endereco;
	}

	// Atribuindo informações a Classe Médico: Especialidade, Nome e Endereço
	public static Medico<String, String> Fisioterapeuta() {
		return new Medico<String, String>("Marcela Carvalho", "Rua Santa Luzia");
	}

	public static Medico<String, String> Neurologista() {
		return new Medico<String, String>("Lucas Freire", "Av. Franklin Roosevelt");
	}

	public static Medico<String, String> Endocrinologista() {
		return new Medico<String, String>("Andre Lima", "Rua Pedro I");
	}

	public static Medico<String, String> Nutricionista() {
		return new Medico<String, String>("Gabriel Barbosa", "Av. Borge de Medeiros");
	}

	public static Medico<String, String> Laboratorio() {
		return new Medico<String, String>("Laboratorio de Analises Clinicas Pais & Filho", "Av. Geremário Dantas");
	}

	public static Medico<String, String> Internacao() {
		return new Medico<String, String>("Hospital Barra D'Or", "Av. Ayrton Senna");
	}
}
