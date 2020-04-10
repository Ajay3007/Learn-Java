/*This program illustrate for static method in the different class*/
import java.io.Console;
import java.util.Arrays;

class Statc{
	static void Add(int a, int b){
		Console con = System.console();
		int sum = a + b;
		con.printf("Sum of the numbers is = %d%n",sum);
	}
}

class StaticDiffClass{
	public static void main(String args[]){
		Console con = System.console();
		con.printf("Enter first number : %n");
		int a = Integer.parseInt(con.readLine());
		con.printf("Enter second number : %n");
		int b = Integer.parseInt(con.readLine());
		Statc.Add(a,b);
	}
}