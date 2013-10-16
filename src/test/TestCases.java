package test;

public class TestCases {
	int[][] testCases = new int[36][4];
	public int[][] setTest(){
		for(int i = 0; i < 36; i+=3) {
			//Profundidade da Caixa
			testCases[i][3] = 1;
			testCases[i+1][3] = 2;
			testCases[i+2][3] = 10000;
		}
		for(int i = 0; i < 12; i++) {
			testCases[i][0] = 1;
			testCases[i+12][0] = 0;
			testCases[i+24][0] = 10001;
		}
		for(int i = 0; i < 36; i++) {
			testCases[i][2] = 1;
			testCases[i+3][2] = 10001;
			testCases[i+6][2] = 1;
			testCases[i+9][2] = 0;
			if(i == 2) i=11;
			if(i == 14) i = 23;
			if(i == 26) i=35;
		}
		for(int i = 0; i < 30; i++){
			testCases[i][1] = 1;
			testCases[i+6][1] = 0;
			if(i == 5) i = 11;
			if(i == 17) i = 23;
			if(i == 29) i=35;
		}
		for(int i = 18; i < 24; i++){
			testCases[i][1] = 10001;
		}
		return testCases;
	}
}
