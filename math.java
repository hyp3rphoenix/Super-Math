package superMath;

public class math {
	public math() {}
	
	public static double rand(double startVal, double endVal) { //Random Int between two values
		double randVal = Math.random();
		randVal *= (endVal - startVal) + 1;
		randVal += startVal;
		return randVal;
	}
	
	public double randInt(int startVal, int endVal) { //Random Int between two values
		return (int)rand(startVal, endVal);
	}
}
