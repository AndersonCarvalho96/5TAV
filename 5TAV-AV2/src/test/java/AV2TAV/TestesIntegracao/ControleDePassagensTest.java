package AV2TAV.TestesIntegracao;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

import AV2TAV.models.ControleDePassagens;
import AV2TAV.models.Onibus;
import AV2TAV.models.Passageiro;
import AV2TAV.models.Rotas;

class GestaoDePassagensTest {

	
	@Test
	public void saidaParada () {
		Set<Passageiro> passageiros = new HashSet<Passageiro>(28);
		Onibus onibus = new Onibus();
		
		onibus.setLugares(28);
		onibus.setTipo("Leito");
		
		Passageiro p = new Passageiro();
		
		
		p.setCpf("123.456.789.01");
		
		p.setNome("Marcus");
		
		p.setRumo("Rio de Janeiro");
		
		
		
		passageiros.add(p);
		
		Passageiro p1 = new Passageiro();
		
		p1.setCpf("234.567.890-12");
		
		p1.setNome("Julia");
		
		p1.setRumo("Salvador");
		
		passageiros.add(p1);
		
		Passageiro p2 = new Passageiro();
		
		p2.setCpf("345.678.901-22");
		
		p2.setNome("Lucas");
		
		p2.setRumo("São João de Meriti");
		
		passageiros.add(p2);
		
		onibus.setViajante(passageiros);
				
		Rotas rotas = new Rotas();
		
		Set<String> paradas = new HashSet <String>();
		
		paradas.add("São Gonçalo");
		
		paradas.add("Nova Iguaçu");
		
		paradas.add("São João de Meriti");
		
		
		rotas.setKm(449.5);
		
		rotas.setTrajeto("T");
		
		rotas.setParadas(3);
		
		rotas.setDestino("Santos");
		
		rotas.setNomeParadas(paradas);
		
		ControleDePassagens validaSaida = new ControleDePassagens();

		
		Integer esperado = 2;
		

		var resultado = validaSaida.pontoSaida(onibus, rotas, p2);
		

	
		assertEquals(resultado, esperado);

	}
	
	@Test
	public void validaCompra() {
	
		Set<Passageiro> passageiros = new HashSet<Passageiro>(28);
		Onibus onibus = new Onibus();
		
		onibus.setLugares(28);
		onibus.setTipo("Leito");
		
		Passageiro passageiro = new Passageiro();
		
		passageiro.setCpf("123.456.789.01");
		
		passageiro.setNome("Marcus");
		
		passageiro.setRumo("Rio de Janeiro");
		
		passageiros.add(passageiro);
		
		onibus.setViajante(passageiros);
		
		Rotas rotas = new Rotas();
		
		Set<String> paradas = new HashSet <String>();
		paradas.add("Centro");
		
		paradas.add("Niterói");
		
		paradas.add("Maricá");
		
		
		rotas.setKm(152.1);
		
		rotas.setTrajeto("T");
		
		rotas.setParadas(4);
		
		rotas.setDestino("Salvador");
		
		rotas.setNomeParadas(paradas);
		
		ControleDePassagens compraPassagem = new ControleDePassagens();
		
		Double esperado = (449.5 * 0.6) * 0.9;
		
	
		var resultado = compraPassagem.vendaPassagens(passageiro, onibus, rotas);
		
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void validaEntrada() {
		
		Set<Passageiro> passageiros = new HashSet<Passageiro>(2);
		Onibus onibus = new Onibus();

		onibus.setLugares(2);
		onibus.setTipo("Leito");

		Passageiro passageiro = new Passageiro();
		
		Passageiro passageiro1 = new Passageiro();
		
		Passageiro passageiro2 = new Passageiro();

	
		passageiro.setCpf("123.456.789.01");
		
		passageiro.setNome("Marcus");
		
		passageiro.setRumo("Rio de Janeiro");
		

		passageiro1.setCpf("234.567.890-12");
		
		passageiro1.setNome("Claudia");
		
		passageiro1.setRumo("Manaus");
		
		
		passageiro2.setCpf("345.678.903-52");
		
		passageiro2.setNome("Pedro");
		
		passageiro2.setRumo("São Paulo");
		
		
		passageiros.add(passageiro);
		
		passageiros.add(passageiro1);
		
		passageiros.add(passageiro2);


		onibus.setViajante(passageiros);

		Rotas rotas = new Rotas();

		Set<String> paradas = new HashSet <String>();
		
        paradas.add("São Gonçalo");
		
		paradas.add("Nova Iguaçu");
		
		paradas.add("São João de Meriti");

		rotas.setKm(235.1);
		
		rotas.setTrajeto("T");
		
		rotas.setParadas(3);
		
		rotas.setDestino("Santos");
		
		rotas.setNomeParadas(paradas);

		ControleDePassagens compraPassagem = new ControleDePassagens();

		Double esperado = 0.0; 


		var resultado = compraPassagem.vendaPassagens(passageiro, onibus, rotas);

		assertEquals(resultado, esperado);
	}
	
	
	


}
