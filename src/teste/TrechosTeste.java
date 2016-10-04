package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import modelo.TrechoAereo;
import modelo.TrechoComposto;
import modelo.TrechoSimples;

public class TrechosTeste {

	@Test
	public void origemTrechoComposto() {
		TrechoAereo ts1 = new TrechoSimples("São Paulo", "Brasilia", 400.0);
		TrechoAereo ts2 = new TrechoSimples("Brasilia", "Recife", 500.0);
		TrechoAereo tc1 = new TrechoComposto(ts1, ts2, 30.0);
		assertEquals("São Paulo", tc1.getOrigem());
	}
	
	@Test
	public void destinoTrechoComposto(){
		TrechoAereo ts1 = new TrechoSimples("São Paulo", "Brasilia", 400.0);
		TrechoAereo ts2 = new TrechoSimples("Brasilia", "Recife", 500.0);
		TrechoAereo tc1 = new TrechoComposto(ts1, ts2, 30.0);
		assertEquals("Recife", tc1.getDestino());
	}
	
	@Test
	public void precoTrechoComposto(){
		TrechoAereo ts1 = new TrechoSimples("São Paulo", "Brasilia", 400.0);
		TrechoAereo ts2 = new TrechoSimples("Brasilia", "Recife", 500.0);
		TrechoAereo tc1 = new TrechoComposto(ts1, ts2, 30.0);
		assertEquals(930.0, tc1.getPreco(), 0.00001);
	}
	
	@Test
	public void origemTresTrechos(){
		TrechoAereo ts1 = new TrechoSimples("São Paulo", "Brasilia", 400.0);
		TrechoAereo ts2 = new TrechoSimples("Brasilia", "Recife", 500.0);
		TrechoAereo ts3 = new TrechoSimples("Recife", "Teresina", 200.0);
		TrechoAereo tc1 = new TrechoComposto(ts1, ts2, 30.0);
		TrechoAereo completo = new TrechoComposto(tc1, ts3, 50.0);
		assertEquals("São Paulo", completo.getOrigem());
	}
	
	@Test
	public void destinoTresTrechos(){
		TrechoAereo ts1 = new TrechoSimples("São Paulo", "Brasilia", 400.0);
		TrechoAereo ts2 = new TrechoSimples("Brasilia", "Recife", 500.0);
		TrechoAereo ts3 = new TrechoSimples("Recife", "Teresina", 200.0);
		TrechoAereo tc1 = new TrechoComposto(ts1, ts2, 30.0);
		TrechoAereo completo = new TrechoComposto(tc1, ts3, 50.0);
		assertEquals("Teresina", completo.getDestino());
	}
	
	@Test 
	public void precoDeTresTechos(){
		TrechoAereo ts1 = new TrechoSimples("São Paulo", "Brasilia", 400.0);
		TrechoAereo ts2 = new TrechoSimples("Brasilia", "Recife", 500.0);
		TrechoAereo ts3 = new TrechoSimples("Recife", "Teresina", 200.0);
		TrechoAereo tc1 = new TrechoComposto(ts1, ts2, 30.0);
		TrechoAereo completo = new TrechoComposto(tc1, ts3, 50.0);
		assertEquals(1180.0, completo.getPreco(), 0.00001);	
	}
	
	@Test(expected=RuntimeException.class)
	public void deveDarErroNosTrechos(){
		TrechoAereo ts1 = new TrechoSimples("São Paulo", "Brasilia", 400.0);
		TrechoAereo ts3 = new TrechoSimples("Recife", "Teresina", 200.0);
		TrechoAereo tc = new TrechoComposto(ts1, ts3, 30.0);
	}

}
