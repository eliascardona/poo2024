package uaa.elias.ventas.models.arrayModel;

public class Venta {
	private int id;
	private String referencia;
	private float valorDeVenta;

	public Venta(int _id, String _referencia, float _valorDeVenta) {
		this.id = _id;
		this.referencia = _referencia;
		this.valorDeVenta = _valorDeVenta;
	}

	public int getId() {
		return id;
	}
	public String getReferencia() {
		return referencia;
	}
	public float getValorDeVenta() {
		return valorDeVenta;
	}


}
