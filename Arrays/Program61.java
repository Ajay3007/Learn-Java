/*This program calculate the electricity charges for different categories of consumers.*/
import java.io.Console;
import java.util.Arrays;
class Program61{
	public static void main(String args[]){
		Console con = System.console();
		String consumers[] = {"Raman", "Balaji", "Public School", "ABC Hardware", "RMK Industry"};
		int units[] = {75, 250, 800, 550, 12450};
		int cat[] = {1,1,2,3,4};
		int maxcol = 40,i;
		double bill = 0;
		for(i=0;i<maxcol;i++)
			con.printf("_");
		con.printf("\n");
		con.printf("%10s %10s %8s %8s%n","Consumer","Categories","Units","Charges");
		for(i=0;i<maxcol;i++)
			con.printf("_");
		con.printf("\n");
		int noc = consumers.length;
		for(i=0;i<noc;i++){
			switch(cat[i]){
				case 1:
					bill = units[i]*1.0;
					break;
				case 2:
					bill = units[i]*1.75;
					break;
				case 3:
					bill = units[i]*2.5;
					break;
				case 4:
					bill = units[i]*3.0;
					break;
				default:
					con.printf("Category mismatch");
			}
			con.printf("%-12s\t%1d\t  %5d\t%7.1f%n",consumers[i],cat[i],units[i],bill);
		}
		for(i=0;i<maxcol;i++)
			con.printf("_");
		con.printf("\n");
		
	}
}