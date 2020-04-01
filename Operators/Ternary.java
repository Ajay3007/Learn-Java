/*This program illustrates the use of Ternary operators*/
import java.io.Console;
class Ternary{
	public static void main(String args[]){
		Console con = System.console();
		int mark = 75;
		String smark, result;
		con.printf("Type in the mark:");
		//Get the mark from the console as String
		smark = con.readLine();
		// readLine() method reads the keyboard entries as string
		//convert String to int
		mark = Integer.parseInt(smark);
		// Integer.parseInt() converts String to int
		result = (mark>40)?"Pass":"fail";
		con.printf("Result = %s%n",result);
	}
}