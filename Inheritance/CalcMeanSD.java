/*This program calculate mean and standard deviation of the given data*/
import java.io.Console;
import java.util.Arrays;

class MeanSD{
	double num[];
	int arlen;
	MeanSD(double a[]){
		arlen = a.length;
		num = new double[arlen];
		for(int i = 0; i<arlen; i++){
			num[i] = a[i];
		}
	}
	double Mean(){
		double sum = 0;
		for(int i = 0; i<arlen; i++){
			sum += num[i];
		}
		double mean = sum/arlen;
		return mean;
	}
}

class SD extends MeanSD{
	double diff[];
	MeanSD ms;
	double xmean;
	SD(double x[]){
		super(x);
		arlen = x.length;
		diff = new double[arlen];
		xmean = super.Mean();
		for(int i = 0; i<arlen; i++){
			diff[i] = x[i] - xmean;
			diff[i] = diff[i] * diff[i];
		}
	}
	
	double StdDev(){
		ms = new MeanSD(diff);
		double sd = Math.sqrt(ms.Mean());
		return sd;
	}
	
}

class CalcMeanSD{
	public static void main(String args[]){
		Console con = System.console();
		con.printf("Enter number of data entry: ");
		int n = Integer.parseInt(con.readLine());
		double x[] = new double[n];
		con.printf("Enter %d data%n",n);
		for(int i=0;i<n;i++){
			x[i] = Double.parseDouble(con.readLine());
		}
		con.printf("%n");
		con.printf("Given data x = ");
		for(int i=0;i<n;i++){
			con.printf("%3.0f ",x[i]);
		}
		con.printf("%n");
		SD ds = new SD(x);
		double xm = ds.Mean();
		double sd = ds.StdDev();
		con.printf("Mean of the given data = %6.2f%n",xm);
		con.printf("Standard Deviation of the given data = %6.2f%n",sd);
	}
}
