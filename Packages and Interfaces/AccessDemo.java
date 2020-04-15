/*This program illustrate the use of package statements*/
package Packages_and_Interfaces;
import java.io.Console;
import java.util.Arrays;

class B extends A{
	public void PrintB(){
		con.printf("%nPrinting in Sub-class B%n");
		con.printf("x = %d%n",x);
		//Don't try this : con.printf("Private x = %d%n",x_pri);
		con.printf("Protected x = %d%n",x_pro);
		con.printf("Public x = %d%n",x_pub);
	}
}

class C{
	public void PrintC(){
		A a = new A();
		Console con = System.console();
		con.printf("%nPrinting in non subclass C%n");
		con.printf("x = %d%n",a.x);
		//Not accessible here : con.printf("Private x = %d%n",a.x_pri);
		con.printf("Protected x = %d%n",a.x_pro);
		con.printf("Public x = %d%n",a.x_pub);
	}
}

class AccessDemo{
		public static void main(String args[]){
			A a = new A();
			B b = new B();
			C c = new C();
			Console con = System.console();
			con.printf("%nPrinting in the same package%n");
			a.PrintA();
			b.PrintB();
			c.PrintC();
		}
}