package utils;

public class HolaMundo {

	public static void main(String[] args) {
		
		Point p = new Point(3,3);
		Point otherp = new Point(4,4);
		
		
		
		Rectangle r = new Rectangle(p, otherp);
		Rectangle r2 = new Rectangle();
		double m = p.module();
		
		System.out.println("El modulo es " + m );
		p.showPoint();
	
		System.out.println("Distancia " + p.distance(otherp) + "\n");
		
		r.showRectangle();
		System.out.println("Rectangulo \n");
		System.out.println("Area " + r.area());
		System.out.println("Perimetro " + r.perimeter());
		System.out.println("Es cuadrado  " + r.isSquare());
		
		
		r.scale(2);
		r.showRectangle();
		System.out.println("Area " + r.area());
		System.out.println("Perimetro " + r.perimeter());
		System.out.println("Es cuadrado  " + r.isSquare());
		
		r.sumRectangle(r2);
		r.showRectangle();
		
		aa
		
	}
}
