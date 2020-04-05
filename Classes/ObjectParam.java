/*This program shows how to use two methods*/
import java.io.Console;
import java.util.Arrays;

class Circle{
	double radius;
	//Take the PI value from Math class
	double pi = Math.PI;
	Circle(double r){
		radius = r;
	}
	double Area(Circle obj){
		return pi * obj.radius * obj.radius;
	}
}

class ObjectParam{
	public static void main(String args[]){
		Console con = System.console();
		con.printf("Enter the radius of Circle:%n");
		double r = Double.parseDouble(con.readLine());
		Circle cr = new Circle(r);
		double area = cr.Area(cr);
		con.printf("Area of Circle with radius %5f = %6f%n",r,area);
	}
}