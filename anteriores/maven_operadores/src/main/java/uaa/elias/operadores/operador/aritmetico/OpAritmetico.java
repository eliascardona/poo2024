package uaa.elias.operadores.operador.aritmetico;

public class OpAritmetico {
	private int valor1;
	private int valor2;

	public OpAritmetico(int valor1v, int valor2v) {
		this.valor1 = valor1v;
		this.valor2 = valor2v;
	}

	public void opSuma() {
		int suma = valor1 + valor2;
		return suma;
	}
}
