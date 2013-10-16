package test;

import main.Bola;
import main.Caixa;
import main.Expedicao;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ExpedicaoTestAllCombinations {

	Bola bola = new Bola();
	Caixa caixa = new Caixa();
	Expedicao sedex = new Expedicao();
	TestCases t = new TestCases();
	int[][] test = t.setTest();
	int i = -1;
	public void setUp(){
		i++;
	}
	
	@Test
	public void T1() {
		caixa.altura = 1;
		caixa.largura = 10001;
		caixa.profundidade = 1;
		bola.diametro = 1;
		assertEquals(true, sedex.sedex(bola, caixa));
	}
}
