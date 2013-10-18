package main;

public class Expedicao {
	
	Bola bola = new Bola();;
	Caixa caixa = new Caixa();
	
	public boolean sedex(Bola bola, Caixa caixa){
		boolean saida = false;
		if(bola.diametro >=1 && bola.diametro<=10000)
			if(caixa.altura >=1 && caixa.altura<=10000)
				if(caixa.largura >=1 && caixa.largura<=10000)
					if(caixa.profundidade >=1 && caixa.profundidade<=10000)
						if(bola.diametro <= caixa.altura && bola.diametro <= caixa.largura && bola.diametro <= caixa.profundidade)
			saida = true;
		return saida;
	}
	}
