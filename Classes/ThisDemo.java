/*This program shows how to use this keyword*/
import java.io.Console;
import java.util.Arrays;

class Address{
	Console con = System.console();
	String name,city;
	int pin;
	//Define a constructor
	Address(String name, String city, int pin){
		name = name;
		city = city;
		pin = pin;
	}
	/*
	Address(String name, String city, int pin){
		this.name = name;
		this.city = city;
		this.pin = pin;
	}
	*/
	//Declare a method to print address
	void printadrs(){
		con.printf("Name : %s%nCity : %s%nPin : %s%n",name,city,pin);
	}
}

class ThisDemo{
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