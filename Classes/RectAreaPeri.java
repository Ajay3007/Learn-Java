/*This program shows how to use two methods*/
import java.io.Console;
import java.util.Arrays;

class Rectangle{
	double length,breadth;
	Rectangle(double l, double b){
		length = l;
		breadth = b;
	}
	double Area(){
		return length*breadth;
	}
	double Perimeter(){
		return 2 * (length + breadth);
	}
}

class RectAreaPeri{
	public static void main(String args[]){
		Console con = System.console();
		con.printf("Enter the length of Rectangle:%n");
		double len = Double.parseDouble(con.readLine());
		con.printf("Enter the breadth of the Rectangle:%n");
		double bred = Double.parseDouble(con.readLine());
		Rectangle rect = new Rectangle(len, bred);
		double rec_area = rect.Area();
		double rec_Peri = rect.Perimeter();
		con.printf("Perimeter of Rectangle with Length %f and Breadth %f = %f%n%n",len,bred,rec_Peri);
		con.printf("Area of Rectangle with Length %f and Breadth %f = %f%n%n",len,bred,rec_area);
	}
}