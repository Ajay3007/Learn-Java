/*This program illustrate the use of compareTo() method to sort the string in alphabetical order */
import java.io.Console;

class StringSort{
	public static void main(String args[]){
		Console con = System.console();
		String name[] = {"Zakir Khan", "Mahesh", "Harish", "Amarjeet Pratap", "Amarjeet Pandey", "Satish"};
		String temp;
		int n = name.length;
		con.printf("The given names in original order:%n");
		for(int i=0; i<n; i++){
			con.printf("%s, ",name[i]);
		}
		for(int i = 0; i < n; i++){
			for(int j = i+1; j < n; j++){
				if(name[i].compareTo(name[j])>0){
					temp = name[i];
					name[i] = name[j];
					name[j] = temp;
				}
			}
		}
		con.printf("%n%nThe given names in alphabetical/Sorted order:%n");
		for(int i=0; i<n; i++){
			con.printf("%s, ",name[i]);
		}
	}
}