/*This program illustrate final method*/
import java.io.Console;
import java.util.Arrays;

class A{
	double result;
	final double Process(double x, double y){
		result = x*y;
		return result;
	}
}

class B extends A{
	//Overriding is not possible
	double Devide(double x, double y){
		result =  x/y;
		return result;
	}
}

class FinalMethod{
	public static void main(String args[]){
		Console con = System.console();
		double p = 10.0, q = 4.0, aval, bval;
		A a = new A();
		B b = new B();
		aval = a.Process(p, q);
		bval = b.Devide(p, q);
		con.printf("%4.1f and %4.1f processed in A = %4.1f%n",p,q,aval);
		con.printf("%4.1f and %4.1f divided in B = %4.1f%n",p,q,bval);
	}
}