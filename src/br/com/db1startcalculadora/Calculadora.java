package br.com.db1startcalculadora;

public class Calculadora {
	private Integer somar;
	private Integer subtrair;
	private Integer multiplicar;
	private Integer dividir;

	public int somar(int n1, int n2) {
		return n1 + n2;
	}

	public int subtratir(int n1, int n2) {
		return n1 - n2;
	}

	public int multiplicar(int n1, int n2) {
		return n1 * n2;
	}

	public int divirdir(int n1, int n2) {
		return n1 / n2;
	}
}
