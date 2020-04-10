/*This program illustrate for static method within the same class*/
import java.io.Console;
import java.util.Arrays;

class StaticSameClass{
	static void Add(int a, int b){
		Console con = System.console();
		int sum = a + b;
		con.printf("Sum of the numbers is = %d%n",sum);
	}
	public static void main(String args[]){
		Console con = System.console();
		con.printf("Enter first number : %n");
		int a = Integer.parseInt(con.readLine());
		con.printf("Enter second number : %n");
		int b = Integer.parseInt(con.readLine());
		Add(a,b);
	}
}
