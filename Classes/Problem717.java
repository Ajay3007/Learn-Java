/*This program shows how to use two methods*/
import java.io.Console;
import java.util.Arrays;

class Employee{
	int basicPay;
	String name,empCode;
	double hra,da;
	Employee(String empCode,String name,int basicPay){
		this.empCode = empCode;
		this.name = name;
		this.basicPay = basicPay;
	}
	double HRA(){
		return basicPay*0.1;
	}
	double DA(){
		return 45*basicPay/100.0;
	}
	double TotalPay(){
		hra = basicPay*0.1;
		da = 45*basicPay/100.0;
		return hra+da+basicPay;
	}
}

class Problem717{
	public static void main(String args[]){
		Console con = System.console();
		Employee emp;
		for(int i = 1; i<=3; i++){
			con.printf("Enter the Employee Code of employee%d: ",i);
			String ec = con.readLine();
			con.printf("Enter the Employee Name of employee%d: ",i);
			String nam = con.readLine();
			con.printf("Enter the Basic Pay of employee%d: ",i);
			int bp = Integer.parseInt(con.readLine());
			emp = new Employee(ec,nam,bp);
			con.printf("Details of employee%d%n",i);
			con.printf("HRA = %8.2f DA = %8.2f TotalPay = %8.2f%n%n",emp.HRA(),emp.DA(),emp.TotalPay());
		}
		
	}
}