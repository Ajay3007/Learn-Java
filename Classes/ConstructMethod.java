/*This program illustrate how to declare and call a method*/
import java.io.Console;
import java.util.Arrays;

class Address{
	Console con = System.console();
	String name,city;
	int pin;
	//Define a constructor
	Address(String nm, String cty, int pn){
		name = nm;
		city = cty;
		pin = pn;
	}
	//Declare a method to print address
	void printadrs(){
		con.printf("Name : %20s%nCity : %20s%nPin : %10s%n",name,city,pin);
	}
}

class ConstructMethod{
	public static void main(String args[]){
		Console con = System.console();
		con.printf("Enter the name of the person:%n");
		String n = con.readLine();
		con.printf("Enter the City of the person:%n");
		String c = con.readLine();
		con.printf("Enter the Pin where the person lives:%n");
		int p = Integer.parseInt(con.readLine());
		//Create the Address object
		Address adrs = new Address(n,c,p);
		//Call the printadrs method
		adrs.printadrs();
	}
}