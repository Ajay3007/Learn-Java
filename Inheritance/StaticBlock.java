/*This program illustrate the use of static block*/
import java.io.Console;
import java.util.Arrays;

class Statblock{
	Console con = System.console();
	void Printmsg(){
		con.printf("%nOutput of Printmsg() method");
	}
	static{
		Console con = System.console();
		con.printf("%nOutput from static block");
	}
}

class StaticBlock{
	public static void main(String args[]){
		Console con = System.console();
		Statblock sb = new Statblock();
		con.printf("%nFirst Object");
		sb.Printmsg();
		Statblock sb1 = new Statblock();
		con.printf("%nSecond Object");
		sb1.Printmsg();
	}
}
