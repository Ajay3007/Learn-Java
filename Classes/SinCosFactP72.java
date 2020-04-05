/*This program shows how to use two methods*/
import java.io.Console;
import java.util.Arrays;

class Trigno{
	Console con = System.console();
	double x;
	Trigno(double x){
		this.x = x;
	}
	int n = 5,i;
	long factn;
	long Factfun(int nmax){
		long fact = 1;
		for(i=2; i<=nmax; i++){
			fact *= i;
		}
		return fact;
	}
	
	double Sinfun(){
		double sinx = x;
		for(int j=1; j<=n; j++){
			factn = Factfun(2 * j + 1);
			sinx += Math.pow(-1,j) * Math.pow(x,(2 * j + 1))/factn;
		}
		return sinx;
	}
	
	double Cosfun(){
		double cosx = 1;
		for(int j=1; j<=n; j++){
			factn = Factfun(2 * j);
			cosx += Math.pow(-1,j) * Math.pow(x,(2 * j))/factn;
		}
		return cosx;
	}
	
	void Printline(int p){
		for(i=1; i<=p; i++){
			con.printf("-");
		}
		con.printf("%n");
	}
	
}

class SinCosFactP72{
	public static void main(String args[]){
		Console con = System.console();
		double x, sinx, cosx, jsx, jcx;
		int maxcol = 35;
		con.printf("Enter the value of x:%n");
		x = Double.parseDouble(con.readLine());
		Trigno trg = new Trigno(x);
		sinx = trg.Sinfun();
		cosx = trg.Cosfun();
		jsx = Math.sin(x);
		jcx = Math.cos(x);
		
		con.printf("x = %6.3f%nsinx = %6.3f --> jsx = %6.3f%ncosx = %6.3f --> jcx = %6.3f%n",x, sinx, jsx, cosx, jcx);
		trg.Printline(maxcol);
	}
}