package utils;

public class Rectangle {

	// Atributos
	private Point esquinaInferiorIzda, esquinaSuperiorDcha;

	// Constructores
	public Rectangle() {
		esquinaInferiorIzda = new Point();
		esquinaSuperiorDcha = new Point(1, 1);
	}

	public Rectangle(Point p1, Point p2) {
		esquinaInferiorIzda = p1;
		esquinaSuperiorDcha = p2;
	}

	
	
	// Metodos de calculo
	public double calcularBase() {
		return esquinaSuperiorDcha.getX() - esquinaInferiorIzda.getX();
	}

	public double calcularAltura() {
		return esquinaSuperiorDcha.getY() - esquinaInferiorIzda.getY();
	}
	
	

	// Calcula el area del rectangulo
	public double area() {
		return calcularBase() * calcularAltura();

	}

	// Calcular perimetro
	public double perimeter() {
		return 2 * calcularBase() + 2 * calcularAltura();
	}

	// Comprobar si es un cuadrado
	public boolean isSquare() {
		return calcularBase() == calcularAltura();
	}
	
	
	
	

	// Escalar el rectangulo. Se escala el segundo punto
	public void scale(int sc) {
		this.esquinaSuperiorDcha.setX(this.esquinaSuperiorDcha.getX()*sc);
		this.esquinaSuperiorDcha.setY(this.esquinaSuperiorDcha.getY()*sc);
		

	}
	
	public void sumRectangle(Rectangle r){
		this.esquinaSuperiorDcha.setX(this.esquinaSuperiorDcha.getX() + r.esquinaSuperiorDcha.getX());
		this.esquinaSuperiorDcha.setY(this.esquinaSuperiorDcha.getY() + r.esquinaSuperiorDcha.getY());
		
		this.esquinaInferiorIzda.setX(this.esquinaInferiorIzda.getX() + r.esquinaInferiorIzda.getX());
		this.esquinaInferiorIzda.setY(this.esquinaInferiorIzda.getY() + r.esquinaInferiorIzda.getY());
	}
	
	

	public void showRectangle()
	{
		System.out.println("Mostrando rectangulo");
		System.out.print("Inferior izdo: ");
		this.esquinaInferiorIzda.showPoint();
		System.out.print("Superior derecha: ");
		this.esquinaSuperiorDcha.showPoint();
		
	}
	// Rotacion del rectangulo respecto al punto inferior izquierdo
	public void rotate(int ang) {
	}
}
