package util;

public class Cambio {
	
	public static double IOF = 0.06;
	
	public static double calculaValor(double valorDolar, double valorCalculo) {
		return valorDolar * valorCalculo * (1.0 + IOF);
	
	}

}
