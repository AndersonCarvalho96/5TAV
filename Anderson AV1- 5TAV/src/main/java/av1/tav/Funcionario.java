package av1.tav;

public class Funcionario {
	public int idFuncio;
	public String nomeFuncio;
	public boolean temPlano;

	public int getIdFuncio() {
		return idFuncio;
	}

	public void setIdFuncio(int idFuncionario) {
		this.idFuncio = idFuncionario;
	}

	public String getNomeFuncio() {
		return nomeFuncio;
	}

	public void setNomeFuncio(String nomeFuncio) {
		this.nomeFuncio = nomeFuncio;
	}

	public boolean isTemPlano() {
		return temPlano;
	}

	public void setTemPlano(boolean temPlano) {
		this.temPlano = temPlano;
	}

	public String carteirinhaFuncionario(int idFuncionario, String nomeFuncionario, boolean temPlano) {
		int id = idFuncionario;
		String nome = nomeFuncionario;
		String dispoePlano;

		
		if (temPlano == true) { 
			dispoePlano = "Sim";
		} else {
			dispoePlano = "Não";
		}
		return "ID do Funcionário:" + id + "\n" + "Nome do funcionário:" + nome + "\n" + "Usufrui do plano: " + dispoePlano;
	}
}
