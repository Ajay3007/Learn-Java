/*This program illustrate the use of compareTo() method to sort the string in alphabetical order */
import java.io.*;

class StringBuff{
	public static void main(String args[]){
		Console con = System.console();
		StringBuffer name = new StringBuffer("Praveen Kumar Bhattacharya");
		int n = name.length();
		con.printf("Name = %s%n",name);
		con.printf("Length of Name = %d%n",n);
		con.printf("Capacity of Name = %s%n",name.capacity());
		con.printf("name.substring(4) = %s%n",name.substring(4));
		con.printf("name.substring(4,12) = %s%n",name.substring(4,12));
		con.printf("name.insert(0,'S') = %s%n",name.insert(0,'S'));
		con.printf("name.insert(0,Banoth ) = %s%n",name.insert(0,"Banoth "));
		con.printf("name.insert(0,'S') = %s%n",name.insert(0,'S'));
		con.printf("name.append(5024) = %s%n",name.append(5024));
		con.printf("name.append( Nishank) = %s%n",name.append(" Nishank"));
		con.printf("name.reverse = %s%n",name.reverse());
		con.printf("name.delete(0,6) = %s%n",name.delete(0,6));
		con.printf("name.insert(0,'S') = %s%n",name.insert(0,'S'));
	}
}

