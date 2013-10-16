package main;

public class Expedicao {
	
	Bola bola = new Bola();;
	Caixa caixa = new Caixa();
	
	public boolean sedex(Bola bola, Caixa caixa){
		boolean saida = false;
		if(bola.diametro <= caixa.altura && bola.diametro <= caixa.largura && bola.diametro <= caixa.profundidade)
			saida = true;
		return saida;
	}
	}
