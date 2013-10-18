package test;

import main.Bola;
import main.Caixa;
import main.Expedicao;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ExpedicaoTestAllCombinations {

	Bola bola = new Bola();
	Caixa caixa = new Caixa();
	Expedicao sedex = new Expedicao();

	
	@Test
	public void T1() {
		caixa.altura = 1;
		caixa.largura = 1;
		caixa.profundidade = 1;
		bola.diametro = 1;
		assertEquals(true, sedex.sedex(bola, caixa));
	}
	@Test
	public void T2() {
		caixa.altura = 1;
		caixa.largura = 1;
		caixa.profundidade = 2;
		bola.diametro = 1;
		assertEquals(true, sedex.sedex(bola, caixa));
	}
	@Test
	public void T3() {
		caixa.altura = 1;
		caixa.largura = 1;
		caixa.profundidade = 10000;
		bola.diametro = 1;
		assertEquals(true, sedex.sedex(bola, caixa));
	}
	@Test
	public void T4() {
		caixa.altura = 1;
		caixa.largura = 10001;
		caixa.profundidade = 1;
		bola.diametro = 1;
		assertEquals(false, sedex.sedex(bola, caixa));
	}
	@Test
	public void T5() {
		caixa.altura = 1;
		caixa.largura = 10001;
		caixa.profundidade = 2;
		bola.diametro = 1;
		assertEquals(false, sedex.sedex(bola, caixa));
	}
	@Test
	public void T6() {
		caixa.altura = 1;
		caixa.largura = 10001;
		caixa.profundidade = 10000;
		bola.diametro = 1;
		assertEquals(false, sedex.sedex(bola, caixa));
	}
	@Test
	public void T7() {
		caixa.altura = 0;
		caixa.largura = 1;
		caixa.profundidade = 1;
		bola.diametro = 1;
		assertEquals(false, sedex.sedex(bola, caixa));
	}
	@Test
	public void T8() {
		caixa.altura = 0;
		caixa.largura = 1;
		caixa.profundidade = 2;
		bola.diametro = 1;
		assertEquals(false, sedex.sedex(bola, caixa));
	}
	@Test
	public void T9() {
		caixa.altura = 0;
		caixa.largura = 1;
		caixa.profundidade = 10000;
		bola.diametro = 1;
		assertEquals(false, sedex.sedex(bola, caixa));
	}
	@Test
	public void T10() {
		caixa.altura = 0;
		caixa.largura = 0;
		caixa.profundidade = 1;
		bola.diametro = 1;
		assertEquals(false, sedex.sedex(bola, caixa));
	}
	@Test
	public void T11() {
		caixa.altura = 0;
		caixa.largura = 0;
		caixa.profundidade = 2;
		bola.diametro = 1;
		assertEquals(false, sedex.sedex(bola, caixa));
	}
	@Test
	public void T12() {
		caixa.altura = 0;
		caixa.largura = 0;
		caixa.profundidade = 10000;
		bola.diametro = 1;
		assertEquals(false, sedex.sedex(bola, caixa));
	}
	@Test
	public void T13() {
		caixa.altura = 1;
		caixa.largura = 1;
		caixa.profundidade = 1;
		bola.diametro = 0;
		assertEquals(false, sedex.sedex(bola, caixa));
	}
	@Test
	public void T14() {
		caixa.altura = 1;
		caixa.largura = 1;
		caixa.profundidade = 2;
		bola.diametro = 0;
		assertEquals(false, sedex.sedex(bola, caixa));
	}
	@Test
	public void T15() {
		caixa.altura = 1;
		caixa.largura = 1;
		caixa.profundidade = 10000;
		bola.diametro = 0;
		assertEquals(false, sedex.sedex(bola, caixa));
	}
	@Test
	public void T16() {
		caixa.altura = 1;
		caixa.largura = 10001;
		caixa.profundidade = 1;
		bola.diametro = 0;
		assertEquals(false, sedex.sedex(bola, caixa));
	}
	@Test
	public void T17() {
		caixa.altura = 1;
		caixa.largura = 10001;
		caixa.profundidade = 2;
		bola.diametro = 0;
		assertEquals(false, sedex.sedex(bola, caixa));
	}
	@Test
	public void T18() {
		caixa.altura = 1;
		caixa.largura = 10001;
		caixa.profundidade = 10000;
		bola.diametro = 0;
		assertEquals(false, sedex.sedex(bola, caixa));
	}
	@Test
	public void T19() {
		caixa.altura = 10001;
		caixa.largura = 1;
		caixa.profundidade = 1;
		bola.diametro = 0;
		assertEquals(false, sedex.sedex(bola, caixa));
	}
	@Test
	public void T20() {
		caixa.altura = 10001;
		caixa.largura = 1;
		caixa.profundidade = 2;
		bola.diametro = 0;
		assertEquals(false, sedex.sedex(bola, caixa));
	}
	@Test
	public void T21() {
		caixa.altura = 10001;
		caixa.largura = 1;
		caixa.profundidade = 10000;
		bola.diametro = 0;
		assertEquals(false, sedex.sedex(bola, caixa));
	}
	@Test
	public void T22() {
		caixa.altura = 10001;
		caixa.largura = 0;
		caixa.profundidade = 1;
		bola.diametro = 0;
		assertEquals(false, sedex.sedex(bola, caixa));
	}
	@Test
	public void T23() {
		caixa.altura = 10001;
		caixa.largura = 0;
		caixa.profundidade = 2;
		bola.diametro = 0;
		assertEquals(false, sedex.sedex(bola, caixa));
	}
	@Test
	public void T24() {
		caixa.altura = 10001;
		caixa.largura = 0;
		caixa.profundidade = 10000;
		bola.diametro = 0;
		assertEquals(false, sedex.sedex(bola, caixa));
	}
	@Test
	public void T25() {
		caixa.altura = 1;
		caixa.largura = 1;
		caixa.profundidade = 1;
		bola.diametro = 10001;
		assertEquals(false, sedex.sedex(bola, caixa));
	}
	@Test
	public void T26() {
		caixa.altura = 1;
		caixa.largura = 1;
		caixa.profundidade = 2;
		bola.diametro = 10001;
		assertEquals(false, sedex.sedex(bola, caixa));
	}
	@Test
	public void T27() {
		caixa.altura = 1;
		caixa.largura = 1;
		caixa.profundidade = 10000;
		bola.diametro = 10001;
		assertEquals(false, sedex.sedex(bola, caixa));
	}
	@Test
	public void T28() {
		caixa.altura = 1;
		caixa.largura = 10001;
		caixa.profundidade = 1;
		bola.diametro = 10001;
		assertEquals(false, sedex.sedex(bola, caixa));
	}
	@Test
	public void T29() {
		caixa.altura = 1;
		caixa.largura = 10001;
		caixa.profundidade = 2;
		bola.diametro = 10001;
		assertEquals(false, sedex.sedex(bola, caixa));
	}
	@Test
	public void T30() {
		caixa.altura = 1;
		caixa.largura = 10001;
		caixa.profundidade = 10000;
		bola.diametro = 10001;
		assertEquals(false, sedex.sedex(bola, caixa));
	}
	@Test
	public void T31() {
		caixa.altura = 0;
		caixa.largura = 1;
		caixa.profundidade = 1;
		bola.diametro = 10001;
		assertEquals(false, sedex.sedex(bola, caixa));
	}
	@Test
	public void T32() {
		caixa.altura = 0;
		caixa.largura = 1;
		caixa.profundidade = 2;
		bola.diametro = 10001;
		assertEquals(false, sedex.sedex(bola, caixa));
	}
	@Test
	public void T33() {
		caixa.altura = 0;
		caixa.largura = 1;
		caixa.profundidade = 10000;
		bola.diametro = 10001;
		assertEquals(false, sedex.sedex(bola, caixa));
	}
	@Test
	public void T34() {
		caixa.altura = 0;
		caixa.largura = 0;
		caixa.profundidade = 1;
		bola.diametro = 10001;
		assertEquals(false, sedex.sedex(bola, caixa));
	}
	@Test
	public void T35() {
		caixa.altura = 0;
		caixa.largura = 0;
		caixa.profundidade = 2;
		bola.diametro = 10001;
		assertEquals(false, sedex.sedex(bola, caixa));
	}
	@Test
	public void T36() {
		caixa.altura = 0;
		caixa.largura = 0;
		caixa.profundidade = 10000;
		bola.diametro = 10001;
		assertEquals(false, sedex.sedex(bola, caixa));
	}	
}
