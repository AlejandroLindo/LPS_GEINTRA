package utils;

public class Point {
	
	//Atributos
	
	private double x, y;

	// Interfaz

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Point() {
		this.x = 0;
		this.y = 0;
	}

	public double module() {
		return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
	}

	public double phase() {
		return 0.0;
	}

	public void translate(Point origin) {
	}

	// Distancia entre punto actual y otro punto
	public double distance(Point otherPoint) {
		return Math.sqrt(Math.pow(this.x-otherPoint.getX(), 2) + Math.pow(this.y-otherPoint.getY(), 2));
		
	}

	// Rotación del punto respecto del eje x
	public void rotate(double rotationAngle) {
	};

	// Realiza un escalado del eje de coordenadas.
	public void changeScale(int newScale) {
	};
	
	public void showPoint(){
		System.out.println("x=" + this.x + " y=" + this.y);
	}
	
	//Metodos para obtener los atributos
	public double getX()
	{
		return this.x;
	}
	
	public double getY()
	{
		return this.y;
	}
	
	
}
