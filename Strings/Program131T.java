/*This program illustrate the use of compareTo() method to sort the string in alphabetical order 
	Given details of people with their name and sex, print them in alphabetical order of their name. If names are same print sex with M first
*/
import java.io.*;

class Details{
	String name,sex;
	Details(String name, String sex){
		this.name = name;
		this.sex = sex;
	}
}

class Program131T{
	public static void main(String args[]){
		Console con = System.console();
		con.printf("Enter the number of people in data: ");
		int n = Integer.parseInt(con.readLine());
		String pname, psex;
		Details det[] = new Details[n];
		Details pdet;
		for(int i=0; i<n;i++){
			con.printf("Enter Name : ");
			pname = con.readLine();
			con.printf("Enter Sex(M/F) : ");
			psex = con.readLine();
			det[i] = new Details(pname, psex);
		}
		con.printf("Given details in alphabetical order:%n%n");
		con.printf("%-20s %4s%n","Name","Sex");
		for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++){
				if(det[j].name.compareTo(det[i].name)<0){
					pdet = det[i];
					det[i] = det[j];
					det[j] = pdet;
				}
				if((det[j].name.compareTo(det[i].name)==0)&&(det[j].sex.compareTo(det[i].sex)>0)){
					pdet = det[i];
					det[i] = det[j];
					det[j] = pdet;
				}
			}
		}
		for(int i=0; i<n; i++){
			con.printf("%-20s %4s%n",det[i].name,det[i].sex);
		}
	}
}

