package uaa.elias.operadores.operador.binario;

public class OpBinario {
	private int valor1;
	private int valor2;

	public OpBinario(int valor1v, int valor2v) {
		this.valor1 = valor1v;
		this.valor2 = valor2v;
	}

	public void opAnd() {
		int suma = valor1 + valor2;
		return suma;
	}
}
