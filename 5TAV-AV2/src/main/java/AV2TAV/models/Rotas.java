package AV2TAV.models;

import java.util.Set;

public class Rotas {
	
	private String rumo;
	
	private Double quilometros;
	
	private Integer paradas;
	
	private String trajeto;
	
	
	private Set<String> nomeParadas;
	
	public String getTrajeto() {
		return trajeto;
	}
	public void setTrajeto(String trajeto) {
		this.trajeto = trajeto;
	}
	public Double getKm() {
		return quilometros;
	}
	public void setKm(Double km) {
		this.quilometros = km;
	}
	public Integer getParadas() {
		return paradas;
	}
	public void setParadas(Integer paradas) {
		this.paradas = paradas;
	}
	public String getRumo() {
		return rumo;
	}
	public void setDestino(String destino) {
		this.rumo = destino;
	}
	public Set<String> getPontosNome() {
		return nomeParadas;
	}
	public void setNomeParadas(Set<String> nomeParadas) {
		this.nomeParadas = nomeParadas;
	}
} 
