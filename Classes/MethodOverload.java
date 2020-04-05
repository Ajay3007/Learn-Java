/*This program illustrate method overloading*/
import java.io.Console;
import java.util.Arrays;

class Rectangle{
	double length,breadth;
	
	double Area(double l,double b){
		length = l;
		breadth = b;
		return length*breadth;
	}
	
	double Area(double a){
		length = breadth = a;
		return length*breadth;
	}
	
	double Perimeter(double l,double b){
		length = l;
		breadth = b;
		return 2 * (length + breadth);
	}
	
	double Perimeter(double a){
		length = breadth = a;
		return 2 * (length + breadth);
	}
}

class MethodOverload{
	public static void main(String args[]){
		Console con = System.console();
		con.printf("Enter the length of Rectangle:%n");
		double len = Double.parseDouble(con.readLine());
		con.printf("Enter the breadth of the Rectangle:%n");
		double bred = Double.parseDouble(con.readLine());
		Rectangle rect = new Rectangle();
		double rec_area = rect.Area(len,bred);
		double rec_Peri = rect.Perimeter(len,bred);
		con.printf("Perimeter of Rectangle with Length %f and Breadth %f = %f%n%n",len,bred,rec_Peri);
		con.printf("Area of Rectangle with Length %f and Breadth %f = %f%n%n",len,bred,rec_area);
		con.printf("Enter the side of the square:%n");
		double side = Double.parseDouble(con.readLine());
		double sq_area = rect.Area(side);
		double sq_Peri = rect.Perimeter(side);
		con.printf("Perimeter of Square with side %f = %f%n%n",side,sq_Peri);
		con.printf("Area of Rectangle with side %f = %f%n%n",side,sq_area);
	}
}