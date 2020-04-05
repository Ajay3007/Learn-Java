/*This program shows how to calculate tax and discount for sale made in a shop*/
import java.io.Console;
import java.util.Arrays;

class Sales{
	double cost,tax,total,net,discount;
	double tr,dc;
	Sales(double p,double txrate,double dis){
		cost = p;
		tr = txrate;
		dc = dis;
	}
	double Tax(){
		tax = cost * tr/100.0;
		return tax;
	}
	double Total(){
		total = cost + tax;
		return total;
	}
	double Discount(){
		discount = total * dc / 100.0;
		return discount;
	}
	double Net(){
		return (total - discount);
	}
}

class CalTaxDiscP71{
	public static void main(String args[]){
		Console con = System.console();
		Sales s;
		double data[][] = {{586.0, 8.5, 2.0},{2475.0, 12.0, 7.5},{725.0, 9.5, 3.0}};
		int len = data.length;
		int maxcol = 45,i;
		for(i=0; i<maxcol; i++){
			con.printf("_");
		}
		con.printf("%n");
		con.printf("%-8s  %-8s %-8s %-8s  %-8s%n","Sales","Tax","Total","Discount","Net");
		for(i=0; i<maxcol; i++){
			con.printf("_");
		}
		con.printf("%n");
		for(i=0; i<len; i++){
			s = new Sales(data[i][0],data[i][1],data[i][2]);
			con.printf("%7.2f %7.2f %7.2f  %7.2f   %7.2f%n",s.cost,s.Tax(),s.Total(),s.Discount(),s.Net());
		}
		for(i=0; i<maxcol; i++){
			con.printf("_");
		}
		con.printf("%n");
	}
}