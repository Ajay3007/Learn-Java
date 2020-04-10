/*This program illustrate method overriding concept*/
import java.io.Console;
import java.util.Arrays;

class A{
	double result;
	double Process(double x, double y){
		result = x*y;
		return result;
	}
}

class B extends A{
	double Process(double x, double y){
		result =  x/y;
		return result;
	}
}

class Override{
	public static void main(String args[]){
		Console con = System.console();
		double p = 10.0, q = 4.0, aval, bval;
		A a = new A();
		B b = new B();
		aval = a.Process(p, q);
		bval = b.Process(p, q);
		con.printf("%4.1f and %4.1f processed in A = %4.1f%n",p,q,aval);
		con.printf("%4.1f and %4.1f processed in B = %4.1f%n",p,q,bval);
	}
}