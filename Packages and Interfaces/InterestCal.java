/*This program illustrate the use of interface*/

import java.io.Console;
import java.util.Arrays;

interface Deposite{
	void Interest(double principal, int year, double rate);
}

class Simple implements Deposite{
	Console con =  System.console();
	public void Interest(double p, int n, double r){
		double intr, total;
		intr = p*n*r/100.0;
		total = p + intr;
		con.printf("%nPrincipal ammount: Rs%6.0f%n",p);
		con.printf("No. of Years: %d%n",n);
		con.printf("Simple interest rate: %5.2f%n",r);
		con.printf("Interset ammount: Rs%7.0f%n",intr);
		con.printf("Total ammount after %d years: Rs%7.0f%n",n,total);
		
	}
}

class Compound implements Deposite{
	Console con =  System.console();
	public void Interest(double p, int n, double r){
		double intr, total;
		total = p*Math.pow(1 + r/100.0,n);
		intr = total - p;
		con.printf("%nPrincipal ammount: Rs%6.0f%n",p);
		con.printf("No. of Years: %d%n",n);
		con.printf("Simple interest rate: %5.2f%n",r);
		con.printf("Interset ammount: Rs%7.0f%n",intr);
		con.printf("Total ammount after %d years: Rs%7.0f%n",n,total);
	}
}

class InterestCal{
		public static void main(String args[]){
			Console con = System.console();
			con.printf("Enter year: ");
			int nyears = Integer.parseInt(con.readLine());
			con.printf("Enter principal ammount: ");
			double p = Double.parseDouble(con.readLine());
			con.printf("Enter rate of interest: ");
			double rate = Double.parseDouble(con.readLine());
			Simple sim = new Simple();
			Compound com = new Compound();
			sim.Interest(p,nyears,rate);
			com.Interest(p, nyears, rate);
		}
}