/*This program illustrate final class*/
import java.io.Console;
import java.util.Arrays;

final class FinCircle{
	double radius;
	final double pi = Math.PI;
	FinCircle(double r){
		radius = r;
	}
	double Area(){
		return pi*radius*radius;
	}
	double Circum(){
		return 2*pi*radius;
	}
}

class FinalClass{
	public static void main(String args[]){
		Console con = System.console();
		double ar,cir,rad;
		con.printf("Enter radius of the circle:%n");
		rad = Double.parseDouble(con.readLine());
		FinCircle circle = new FinCircle(rad);
		ar = circle.Area();
		cir = circle.Circum();
		con.printf("Radius of the circle = %5.1f%n",rad);
		con.printf("Area of the circle = %5.1f%n",ar);
		con.printf("Circumference of the circle = %5.1f%n",cir);
	}
}