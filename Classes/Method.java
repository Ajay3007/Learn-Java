/*This program illustrate how to declare and call a method*/
import java.io.Console;
import java.util.Arrays;

class Address{
	String name,city;
	int pin;
	void Assign(String nm, String cty, int pn){
		name = nm;
		city = cty;
		pin = pn;
	}
}

class Method{
	public static void main(String args[]){
		Console con = System.console();
		//Create the Address object
		Address adrs = new Address();
		con.printf("Enter the name of the person:%n");
		String n = con.readLine();
		con.printf("Enter the City of the person:%n");
		String c = con.readLine();
		con.printf("Enter the Pin where the person lives:%n");
		int p = Integer.parseInt(con.readLine());
		adrs.Assign(n,c,p);
		con.printf("Name : %20s%n",adrs.name);
		con.printf("City : %20s%n",adrs.city);
		con.printf("Pin : %20d%n",adrs.pin);
	}
}