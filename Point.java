package superMath;

public class Point {
	public double x, y;
	public int xInt, yInt;
	
	boolean debug = true;
	
	public Point(double xVal, double yVal) {
		x = xVal; y = yVal;
		xInt = (int)x; y = (int)y;
	}
	
	public Point(Point p) {
		x = p.x; y = p.y;
		
		xInt = (int)x; y = (int)y;
	}

	public void translate(double xMove, double yMove) {
		x += xMove; y += yMove;
		xInt = (int)x; y = (int)y;
	}
	
	public void rotate(Point axis, double angle) { //Angle in degree
		Point s = Point.sub(this, axis);
		Line l = new Line(new Point(s.x, s.y), new Point(0, 0));
		double r = l.getDist();
		
		if(debug) {
			System.out.println("Dist: " + r);
		}
		
		x = r * Math.cos(angle) + axis.x;
		y = r * Math.sin(angle) + axis.y;
		
		if(debug) {
			Point p = new Point(x, y);
			p.PointPrintln("Rotation", p);
		}
	}
	
	
	public void PointPrintln(String name, Point p) {
		System.out.println(name + ": (" + p.x + ", " + p.y + ")");
	}
	
	public void PointPrintln(String name) {
		System.out.println(name + ": (" + this.x + ", " + this.y + ")");
	}
	
	public void add(Point p) {
		
	}
	
	public static Point(Point p, Point s) {
		
	}
	
	public void sub(Point p) {
		x -= p.x;
		y -= p.y;
	}
	
	public static Point sub(Point p, Point s) {
		Point m = new Point(p.x, p.y);
		m.sub(s);
		
		return m;
	}
	
	public void mult(double scale) {
		x *= scale;
		y *= scale;
	}
	
	public static Point mult(Point p, double scale) {
		Point m = new Point(p.x, p.y);
		m.x *= scale;
		m.y *= scale;
		
		return p;
	}
	
	public void div(double scale) {
		
	}
}
