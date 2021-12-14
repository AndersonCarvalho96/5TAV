package AV2TAV.models;

public class ControleDePassagens {

	private Double custoTotal;

	public Double vendaPassagens(Passageiro viajante, Onibus onibus, Rotas rotas) {

		if (onibus.getLocais() > onibus.getViajante().size()) {
			
			
			if (rotas.getTrajeto() == "T") {
				custoTotal *= 1.1;
				
			}
			
			if (onibus.getTipo() == "Leito") {
				
				custoTotal = rotas.getKm() * 0.8;
				
			} 
			else if (onibus.getTipo() == "SemiLeito") 
			{
				custoTotal = rotas.getKm() * 0.75;
			} else 
			{
				custoTotal = rotas.getKm() * 0.6;
			}
			
			
			
			return custoTotal;
			
		} else
		
		{
			return 0.0;
		}
	}

	public Integer pontoSaida(Onibus onibus, Rotas rotas, Passageiro viajante) {
		
		if (viajante.getRumo() != rotas.getRumo()) {
			
			for (String p : rotas.getPontosNome()) {
				
				if (viajante.getRumo().equals(p)) {
					
					onibus.getViajante().remove(viajante);
					
				}
			}
		}
		
		return onibus.getViajante().size();
	}
}
