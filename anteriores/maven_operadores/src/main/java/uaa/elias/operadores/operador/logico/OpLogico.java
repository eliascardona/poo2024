package uaa.elias.operadores.operador.logico;

public class OpLogico {
	private int valor1;
	private int valor2;

	public OpLogico(int valor1v, int valor2v) {
		this.valor1 = valor1v;
		this.valor2 = valor2v;
	}

	public void opOr() {
		int suma = valor1 + valor2;
		return suma;
	}
}
