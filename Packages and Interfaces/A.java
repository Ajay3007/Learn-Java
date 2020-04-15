/*This program illustrate the use of package statements*/
package Packages_and_Interfaces;
import java.io.Console;
import java.util.Arrays;

public class A{
	int x = 25;
	private int x_pri = 35;
	protected int x_pro = 45;
	public int x_pub = 55;
	Console con = System.console();
	void PrintA(){
		con.printf("%nPrinting in class A%n");
		con.printf("x = %d%n",x);
		con.printf("Private x = %d%n",x_pri);
		con.printf("Protected x = %d%n",x_pro);
		con.printf("Public x = %d%n",x_pub);
	}
}
