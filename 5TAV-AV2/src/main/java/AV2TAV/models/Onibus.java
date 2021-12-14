package AV2TAV.models;

import java.util.Set;

public class Onibus {
	
	private Set<Passageiro> viajante;

	
	private String tipo;
	
	
	private String id;
	
	
	private Integer locais;
	

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) 
	{
		this.tipo = tipo;
	}
	public Integer getLocais() 
	{
		return locais;
	}
	public String getId() 
	{
		return id;
	}
	public void setId(String id) 
	{
		this.id = id;
	}
	public void setLugares(Integer locais) 
	{
		this.locais = locais;
	}
	public Set<Passageiro> getViajante() 
	{
		return viajante;
	}
	public void setViajante(Set<Passageiro> viajante) 
	{
		this.viajante = viajante;
	}
}
