import java.util.Scanner;
public class getPointOfIntersection {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter x1, y1, x2, y2");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = 0;
		double f = 0;
		
		LinearEquation linearEquation = new LinearEquation(a, b, c, d, e, f);
		if(linearEquation.isSolvable()) {
			System.out.println("x is " + linearEquation.getX() + " and y is " + linearEquation.getY());		
		} else {
			System.out.println("These two lines have no point of intersection");
		}
	}
}