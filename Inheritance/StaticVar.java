/*This program illustrate the use of static variable*/
import java.io.Console;
import java.util.Arrays;

class Stat{
	static int i = 0, j = 0;
	void PrintVal(){
		Console con = System.console();
		con.printf("i = %d%n",i);
		con.printf("j = %d%n",j);
	}
}

class StaticVar{
	public static void main(String args[]){
		Console con = System.console();
		Stat sv = new Stat();
		con.printf("Values of variables in the first object%n");
		sv.PrintVal();
		sv.i = 10;
		sv.j = 15;
		con.printf("Values of variables in the second object%n");
		Stat sv1 = new Stat();
		sv1.PrintVal();
	}
}

/*
Output is:
Values of variables in the first object
i = 0
j = 0
Values of variables in the second object
i = 10
j = 15

	You can see value of i and j, modified in first object sv is retain in the second object sv1.

If we declare the var i and j as simple as int not static then output will be:
Values of variables in the first object
i = 0
j = 0
Values of variables in the second object
i = 0
j = 0
*/