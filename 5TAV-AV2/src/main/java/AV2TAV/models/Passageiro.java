package AV2TAV.models;

public class Passageiro {
	

	
	private String nome;
	
	private String rumo;
	
	private String cpf;
	
	
	public String getCpf() 
	{
		return cpf;
	}
	public void setCpf(String cpf) 
	{
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public String getRumo() {
		return rumo;
	}
	
	public void setRumo(String rumo)
	{
		this.rumo = rumo;
	}
}
