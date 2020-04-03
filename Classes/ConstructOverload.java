/*This program shows constructor overloading*/
import java.io.Console;
import java.util.Arrays;

class Address{
	Console con = System.console();
	String name,city;
	int pin;
	//First constructor
	Address(String nm, String cty, int pn){
		name = nm;
		city = cty;
		pin = pn;
	}
	//Second Constructor
	Address(String nm, String cty){
		name = nm;
		city = cty;
		pin = 100000;
	}
	//Third Constructor
	Address(){
		name = "Ajay Kumar Gupt";
		city = "Gorakhpur";
		pin = 273311;
	}
	
	//Declare a method to print address
	void printadrs(){
		con.printf("Name : %s%nCity : %s%nPin : %s%n",name,city,pin);
	}
}

class ConstructOverload{
	public static void main(String args[]){
		Console con = System.console();
		con.printf("Enter the name of the person:%n");
		String n = con.readLine();
		con.printf("Enter the City of the person:%n");
		String c = con.readLine();
		con.printf("Enter the Pin where the person lives:%n");
		int p = Integer.parseInt(con.readLine());
		//Create the Address object
		Address adrs1,adrs2,adrs3;
		adrs1 = new Address(n,c,p);
		adrs2 = new Address(n,c);
		adrs3 = new Address();
		//Call the printadrs method
		adrs1.printadrs();
		adrs2.printadrs();
		adrs3.printadrs();
		
	}
}