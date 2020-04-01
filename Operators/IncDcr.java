/*This program illustrates the use of increment and decrement operators*/
import java.io.Console;
class IncDcr{
	public static void main(String args[]){
		Console con = System.console();
		int m = 25,p = 70;
		con.printf("m = %d%n",m);
		con.printf("++m = %d%n",++m);
		con.printf("p = %d%n",p);
		con.printf("p++ = %d%n",p++);
		con.printf("p++ after use = %d%n",p);
	}
}