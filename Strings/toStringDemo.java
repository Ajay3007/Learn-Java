/*This program illustrate the use of compareTo() method to sort the string in alphabetical order */
import java.io.*;

class DemoClass{
	int x, y;
	DemoClass(int a, int b){
		x = a;
		y = b;
	}
	
	public String toString(){
	return "Object created with x = "+x+" and y = "+y;
	}
	
}

class toStringDemo{
	public static void main(String args[]){
		Console con = System.console();
		DemoClass dc = new DemoClass(15,45);
		con.printf("Printing in DemoClass : %s%n",dc);
	}
}

/*
//Without toString() method output is:
	Printing in DemoClass : DemoClass@15db9742

//With toString() method ie. same code output is : 
	Printing in DemoClass : Object created with x = 15 and y = 45

*/