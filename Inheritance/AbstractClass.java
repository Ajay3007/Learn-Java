/*This program illustrate the use Abstract class*/
import java.io.Console;
import java.util.Arrays;

abstract class Shape{
	double area;
	final double pi = Math.PI;
	abstract double Area();   	// abstract method. Defined withot a body.
}

class Circle extends Shape{
	double radius;
	Circle(double r){
		radius =  r;
	}
	double Area(){
		area = pi * radius * radius;
		return area;
	}
}


class AbstractClass{
	public static void main(String args[]){
		Console con = System.console();
		con.printf("Enter radius : %n");
		double a = Double.parseDouble(con.readLine());
		Circle cr = new Circle(a);
		double ar = cr. Area();
		con.printf("Area of the circle is = %6.2f: %n",ar);
	}
}
