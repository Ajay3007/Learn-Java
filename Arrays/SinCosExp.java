/*This program calculate the sin(x) and cos(x) expansion, the values obtained are compared with that java functions*/
import java.io.Console;
class SinCosExp{
	public static void main(String args[]){
		Console con = System.console();
		double x,sinx,cosx,jsx,jcx;
		con.printf("Enter value of x: ");
		String sx = con.readLine();
		x = Double.parseDouble(sx);
		con.printf("The value of x = %f%n",x);
		int facts, factc, i, j, m = 5;
		sinx = x;
		cosx = 1;
		for(i = 1; i<=m; i++)
		{
			facts = 1;
			factc = 1;
			for(j = 2; j<=2*i; j++)
				factc *= j;
			for(j = 2; j<=(2*i+1); j++)
				facts *= j;
			sinx += (Math.pow(-1,i)*Math.pow(x,(2*i+1)))/facts;
			cosx += (Math.pow(-1,i)*Math.pow(x,(2*i)))/factc;
		}
		jsx = Math.sin(x);
		jcx = Math.cos(x);
		con.printf("sinx --> %f and jsx --> %f%n",sinx,jsx);
		con.printf("cosx --> %f and jcx --> %f%n",cosx,jcx);
	}
}