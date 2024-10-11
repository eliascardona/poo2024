package uaa.elias.ventas.controllers.arrayController;

import uaa.elias.ventas.models.arrayModel.Venta;


public class ArregloDeVentas {
	private int tamanoDeArreglo;
	private Venta[] ventas;

	public ArregloDeVentas(int _tamanoDeArreglo) {
		this.tamanoDeArreglo = _tamanoDeArreglo;
		this.ventas = new Venta[tamanoDeArreglo];
	}

	public void llenarArregloDeVentas() {
		for(int i=0; i<tamanoDeArreglo; i++) {
			int id = i+1;
			String refer = "Venta" + id + ".";
			float valor = 10*id;

			ventas[i] = new Venta(id, refer, valor);
		}
	}
	public void mostrarArregloDeVentas() {
		Venta[] ventasAux = this.ventas;

		System.out.println(".- Lista de Ventas -.\n");
		System.out.println(String.format("%-10s %-15s %-10s", "Índice", "Referencia", "Valor"));

		for(Venta ventaAux : ventasAux) { 
			if(ventaAux != null) {
				int id = ventaAux.getId();
				String referencia = ventaAux.getReferencia();
				float valor = ventaAux.getValorDeVenta();

				System.out.println(String.format("%-10d %-15s %-10.2f", id, referencia, valor));
			}
		}
	}   // fin del método "mostrarArregloDeVetnas"


}
