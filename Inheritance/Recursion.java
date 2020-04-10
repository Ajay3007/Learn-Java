/*This program illustrate Recursion method*/
import java.io.Console;
import java.util.Arrays;

class FactFun{
	long Fact(int n){
		if(n==0||n==1)
			return 1;
		return n*Fact(n-1);
	}
}

class Recursion{
	public static void main(String args[]){
		Console con = System.console();
		con.printf("Enter number whose Factorial to be calculated:%n");
		int n = Integer.parseInt(con.readLine());
		FactFun f = new FactFun();
		con.printf("Factorial of %d = %d%n",n,f.Fact(n));
	}
}
