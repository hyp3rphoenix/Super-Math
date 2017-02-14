package superMath;

public class Line {
	static Point p1, p2;
	static double m;
	
	public Line(Point p1_, Point p2_) {
		p1 = new Point(p1_.x, p1_.y);
		p2 = new Point(p2_.x, p2_.y);
		
		m = (p1.y - p2.y)/(p1.x - p2.x);
	}
	
	public Line(double x1, double y1, double x2, double y2) {
		p1 = new Point(x1, y1);
		p2 = new Point(x2, y2);
		
		m = (p1.y - p2.y)/(p1.x - p2.x);
	}
	
	public Line(Point p, double slope) {
		p1 = new Point(p.x, p.y); p2 = p1;
		
		m = slope;
	}
	
	public static Point lineIntercept(Point p1, double m1, Point p2, double m2) {
		double x = ((-m1 * p1.x) + (m2 * p2.x) + p1.y - p2.y)/(m2 - m1);
		double y = (m1 * (p1.x - x)) + p1.y; 
		Point intersect = new Point(x, y);
		return intersect;
	}
	
	public static Point lineIntercept(Line l1, Line l2) {
		return lineIntercept(l1.p1, l1.m, l2.p1, l2.m);
	}
	
	public static double getDist() {
		Point origin = new Point(p2.x, p2.y);
		Point p = new Point(p1.x, p1.y);
		p.sub(origin);
		double dist = Math.sqrt(Math.pow(p.x, 2) + Math.pow(p.y, 2));
		return dist;
	}
	
	public static void LinePrintln() {
		System.out.println("y = " + m + "(x - " + p1.x + ") + " + p1.y);
		p1.PointPrintln("Point 1: ");
		p2.PointPrintln("Point 2: ");
	}
	
	public static void LinePrintln(Point s, Point e) {
		double ms = (s.y - e.y)/(s.x - e.x);
		System.out.println("y = " + ms + "(x - " + s.x + ") + " + s.y);
		p1.PointPrintln("Point 1");
		p2.PointPrintln("Point 2");
	}
}
