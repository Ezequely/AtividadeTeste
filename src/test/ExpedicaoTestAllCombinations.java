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
			assertEquals("Medidas fora da Faixa", true,sedex.faixa(test[0][0]));
			assertEquals("Medidas fora da Faixa", true,sedex.faixa(test[0][1]));
			assertEquals("Medidas fora da Faixa", true,sedex.faixa(test[0][2]));
			assertEquals("Medidas fora da Faixa", true,sedex.faixa(test[0][3]));
			assertEquals("Bola não cabe na Caixa: Altura", true,sedex.sedex(test[0][0],test[0][1]));
			assertEquals("Bola não cabe na Caixa: Largura", true,sedex.sedex(test[0][0],test[0][2]));
			assertEquals("Bola não cabe na Caixa: Profundidade", true,sedex.sedex(test[0][0],test[0][3]));
	}
	@Test

	public void T2() {
		assertEquals("Medidas fora da Faixa", true,sedex.faixa(test[3][0]));
		assertEquals("Medidas fora da Faixa", true,sedex.faixa(test[3][1]));
		assertEquals("Medidas fora da Faixa", true,sedex.faixa(test[3][2]));
		assertEquals("Medidas fora da Faixa", true,sedex.faixa(test[3][3]));
		assertEquals("Bola não cabe na Caixa: Altura", true,sedex.sedex(test[3][0],test[3][1]));
		assertEquals("Bola não cabe na Caixa: Largura", true,sedex.sedex(test[3][0],test[3][2]));
		assertEquals("Bola não cabe na Caixa: Profundidade", true,sedex.sedex(test[3][0],test[3][3]));
}

	@Test
	public void T4() {
		assertEquals("Medidas fora da Faixa", true,sedex.faixa(test[3][0]));
		assertEquals("Medidas fora da Faixa", true,sedex.faixa(test[3][1]));
		assertEquals("Medidas fora da Faixa", true,sedex.faixa(test[3][2]));
		assertEquals("Medidas fora da Faixa", true,sedex.faixa(test[3][3]));
		assertEquals("Bola não cabe na Caixa: Altura", true,sedex.sedex(test[3][0],test[3][1]));
		assertEquals("Bola não cabe na Caixa: Largura", true,sedex.sedex(test[3][0],test[3][2]));
		assertEquals("Bola não cabe na Caixa: Profundidade", true,sedex.sedex(test[3][0],test[3][3]));
}
}
