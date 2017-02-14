package superMath;

public class Test {
	
	public static void main(String[] args) {
		testRotation();
	}
	
	public static void testIntersect() {
		Point p = new Point(0, 0);
		Line l1 = new Line(p, 3);
		Line l2 = new Line(p, 2);
		System.out.println("Line 1: y = " + l1.m + "(x - " + l1.p1.x + ") + " + l1.p1.y);
		System.out.println("Line 2: y = " + l2.m + "(x - " + l2.p1.x + ") + " + l1.p1.y);
		Line.lineIntercept(l1, l2).PointPrintln("Intersect");
	}
	
	public static void testRand() {
		double random = math.rand(3, 5);
		System.out.println("Val: " + random);
	}
	
	public static void testRotation() {
		Point p = new Point(0, 0);
		Point r = new Point(0, 5);
		Line l = new Line(p, r);
		l.LinePrintln();
		r.PointPrintln("Before");
		//System.out.println("Pi: " + Math.PI);
		r.rotate(p, Math.PI);
		r.PointPrintln("After");
	}
}
