/*This program calculate sum and average of two given numbers using interface*/

import java.io.Console;
import java.util.Arrays;

interface Exam{
	boolean Pass(int marks);
}

interface Classify{
	String Division(int average);
}

class Result implements Exam, Classify{
	public boolean Pass(int mrk){
		if(mrk >= 50)
			return true;
		else
			return false;
	}
	public String Division(int avg){
		if(avg >= 60)
			return "FIRST";
		else if(avg >= 50 && avg < 60)
			return "SECOND";
		else
			return "NO DIVISION";
	}
}

class Problem916{
		public static void main(String args[]){
			Console con = System.console();
			con.printf("Enter marks of the student: ");
			int mark = Integer.parseInt(con.readLine());
			con.printf("Enter average of the student: ");
			int avg = Integer.parseInt(con.readLine());
			Result res = new Result();
			con.printf("Pass = %b%n",res.Pass(mark));
			con.printf("%nDivision = %s%n",res.Division(avg));
		}
}