/*This program shows how to record students data*/
import java.io.Console;
import java.util.Arrays;

class Student{
	int regNum,sub1,sub2,sub3;
	String name;
	double Avg;
	Student(String nam,int rgn,int s1,int s2,int s3){
		name = nam;
		regNum = rgn;
		sub1 = s1;
		sub2 = s2;
		sub3 = s3;
	}
	double AverageMark(){
		Avg = (sub1+sub2+sub3)/3.0;
		return Avg;
	}
}

class Problem714{
	public static void main(String args[]){
		Console con = System.console();
		con.printf("Enter Registraion Number of the Student:%n");
		int rn = Integer.parseInt(con.readLine());
		con.printf("Enter the Name of the student:%n");
		String nm = con.readLine();
		con.printf("Enter marks in Subject1: ");
		int sb1 = Integer.parseInt(con.readLine());
		con.printf("Enter marks in Subject2: ");
		int sb2 = Integer.parseInt(con.readLine());
		con.printf("Enter marks in Subject3: ");
		int sb3 = Integer.parseInt(con.readLine());
		Student std = new Student(nm,rn,sb1,sb2,sb3);
		double avg = std.AverageMark();
		con.printf("Student Name : %s%nRegistration Number : %d%nAverage Mark : %2.2f%n",nm,rn,avg);
	}
}