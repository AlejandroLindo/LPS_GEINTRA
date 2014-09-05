package utils;

public class ColeccionEnteros {

	private int lista[];
	private int indice;

	// Constantes
	public static final int TAM_MAX = 10;

	// Constructores
	public ColeccionEnteros() {
		this.lista = new int[ColeccionEnteros.TAM_MAX];
		this.indice = 0;
	}

	public ColeccionEnteros(int nElementos) {
		this();
		if (nElementos > ColeccionEnteros.TAM_MAX)
			System.out.println("Numero de elementos mayor que el maximo");
		else {

			for (int i = 0; i < nElementos; i++) {
				this.lista[i] = (int) Math.random() * Integer.MAX_VALUE;
			}
		}
	}

	public void representar() {
		if (indice == 0)
			System.out.println("Ningun elemento");
		else {
			for (int i = 0; i < this.indice; i++) {
				System.out.print(this.lista[i] + " ");
			}
		}
	}

	public void añadir(int dato) {
		if (this.indice == ColeccionEnteros.TAM_MAX)
			System.out.println("Se ha superado el tamaño maximo");
		else
			this.lista[this.indice] = dato;

	}

	public double media() {
		if (this.indice == 0)
			return 0;
		else {
			int sumatorio = 0;
			for (int i = 0; i <= this.indice; i++)
				sumatorio += this.lista[i];

			return (double) sumatorio / (this.indice);
		}
	}

	public int mayor() {
		if (this.indice == 0)
			return 0;
		else {

			int mayorTemp = 0;
			for (int i = 0; i <= this.indice; i++) {
				if (this.lista[i] > mayorTemp) {
					mayorTemp = this.lista[i];
				}
			}
			return mayorTemp;
		}

	}

	public int menor() {
		if (this.indice == 0)
			return 0;
		else {

			int menorTemp = Integer.MAX_VALUE;
			for (int i = 0; i <= this.indice; i++) {
				if (this.lista[i] < menorTemp) {
					menorTemp = this.lista[i];
				}
			}
			return menorTemp;
		}

	}

	public void iniciar() {
		for (int i = 0; i < this.indice; i++)
			this.lista[i] = 0;
	}

	public int tamaño() {
		return this.indice;
	}

}
