/*This program illustrate the creation of a subclass*/
import java.io.Console;
import java.util.Arrays;

class Address{
	Console con = System.console();
	String name,city;
	int pin;
	Address(String nm, String cty, int pn){
		name = nm;
		city = cty;
		pin = pn;
	}
	void Printadrs(){
		con.printf("Name : %20s%nCity : %12s%nPIN CODE : %8d%n", name, city, pin);
	}
}

class Biodata extends Address{
	Console con = System.console();
	String edu;
	int age;
	Biodata(String nm, String cty, int pn, String ed, int ag){
		super(nm,cty,pn);
		edu = ed;
		age = ag;
	}
	void Printbio(){
		con.printf("Name : %20s%nQualification : %4s%nAge : %2d%n",name, edu, age);
		con.printf("City : %12s%nPIN CODE : %8d%n", city, pin);
	}
}

class Inherit{
	public static void main(String args[]){
		Console con = System.console();
		//Create the Address object
		Biodata bd;
		con.printf("Enter the name of the person:%n");
		String n = con.readLine();
		con.printf("Enter the City of the person:%n");
		String c = con.readLine();
		con.printf("Enter the Pin where the person lives:%n");
		int p = Integer.parseInt(con.readLine());
		con.printf("Enter the qualification of the person:%n");
		String qual = con.readLine();
		con.printf("Enter age the person:%n");
		int ag = Integer.parseInt(con.readLine());
		bd = new Biodata(n, c, p, qual, ag);
		con.printf("Address of %s%n",bd.name);
		//Use inherit method to print address
		bd.Printadrs();
		con.printf("%nBiodata of %s%n",bd.name);
		bd.Printbio();
	}
}