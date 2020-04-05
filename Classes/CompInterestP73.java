/*This program shows how to use two methods*/
import java.io.Console;
import java.util.Arrays;

class Deposite{
	int principal,year;
	int compound;
	double rate = 7.0;
	Deposite(int p, int n){
		principal = p;
		year = n;
	}
	int Compound(){
		compound = (int)(principal*Math.pow(1+rate/100,year));
		return compound;
	}
}

class CompInterestP73{
	public static void main(String args[]){
		Console con = System.console();
		con.printf("Enter the Principal ammount:%n");
		int prin = Integer.parseInt(con.readLine());
		con.printf("Enter the Time in year:%n");
		int yr = Integer.parseInt(con.readLine());
		Deposite depo = new Deposite(prin, yr);
		int total = depo.Compound();
		con.printf("Amount after %2d years = Rs. %,5d%n",yr,total);
	}
}