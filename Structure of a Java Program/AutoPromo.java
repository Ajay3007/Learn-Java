import java.io.Console;
class AutoPromo{
	public static void main(String args[]){
		Console con = System.console();
		int n = 25;
		float fx,fy = 45.67f;
		double dx,dy = 76.25;
		long lm,ln = 5678;
		con.printf("\nThe following results illustrate the Automatic promotion\n\n");
		//Automatic promotion of int to float
		fx = n + fy;
		con.printf("float <-- int + float: %6.2f <-- %d + %6.2f\n", fx, n, fy);
		//Automatic promotion of int to double
		dx = n + dy;
		con.printf("double <-- int + double: %6.2f <-- %d + %6.2f\n", dx, n, dy);
		//Automatic promotion of long to float
		fx = ln + fy;
		con.printf("float <-- long + float: %6.2f <-- %d + %6.2f\n", fx, ln, fy);
		//Automatic promotion of int to long
		lm = n + ln;
		con.printf("long <-- int + long: %4d <-- %d + %d\n", lm, n, ln);
	}
}