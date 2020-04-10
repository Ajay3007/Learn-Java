/*This program illustrate the use Abstract class*/
import java.io.Console;
import java.util.Arrays;

class Rectangle{
	double length, breadth, area;
	Rectangle(double length, double breadth){
		this.length = length;
		this.breadth = breadth;
	}
	double Area(){
		area = length * breadth;
		return area;
	}
}

class Cuboid extends Rectangle{
	double height;
	double vol;
	Cuboid(double length, double breadth, double height){
		super(length, breadth);
		this.height = height;
	}
	double Volume(){
		vol = super.Area() * height;
		return vol;
	}
}

class Problem814{
	public static void main(String args[]){
		Console con = System.console();
		con.printf("Enter length of the Rectangular box : ");
		double l = Double.parseDouble(con.readLine());
		con.printf("Enter breadth of the Rectangular box : ");
		double b = Double.parseDouble(con.readLine());
		con.printf("Enter height of the Rectangular box : ");
		double h = Double.parseDouble(con.readLine());
		con.printf("%n");
		//Rectangle rect = new Rectangle(l,b);
		Cuboid cub = new Cuboid(l,b,h);
		con.printf("Area of the Rectangle is = %6.2f %n",cub.Area());
		con.printf("Volume of the Rectangular Box is = %8.2f %n",cub.Volume());
	}
}
