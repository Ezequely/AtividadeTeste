package main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import test.TestCases;

public class Expedicao {
	
	int bola;
	int caixa;
	
	public boolean faixa(int medida) {
		boolean saida = false;
		if(medida >= 1 && medida <= 10000)
			saida = true;
		return saida;
	}
	public boolean sedex(int bola, int caixa){
		boolean saida = false;
		if(bola <= caixa)
			saida = true;
		return saida;
	}

	}
