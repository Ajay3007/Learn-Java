/*This program sorts an array in ascending order using sort method of Array class. Search for the given value using binarySearch() method*/
import java.io.Console;
import java.util.Arrays;
class Arraysort{
	public static void main(String args[]){
		Console con = System.console();
		// Take number of array elements as input
		int markn;
		con.printf("Enter number of Array elements:%n");
		String smarkn = con.readLine();
		markn = Integer.parseInt(smarkn);
		int mark[] = new int[markn];
		int i,j,temp;
		//Take the input of array elements by user
		con.printf("%nEnter elements of array:%n");
		String sx;
		for(i=0; i<markn; i++){
			sx = con.readLine();
			mark[i] = Integer.parseInt(sx);
		}
		//Print out the given numbers
		con.printf("%nThe given numbers%n");
		for(i=0; i<markn; i++){
			con.printf("%d ",mark[i]);
		}
		con.printf("%n%n");
		//Sort the given array in ascending order
		Arrays.sort(mark);
		//Print the sorted numbers
		con.printf("The sorted numbers%n");
		for(i=0; i<markn; i++){
			con.printf("%d ",mark[i]);
		}
		con.printf("%n%nEnter the value to be search: ");
		//search the array for a specific value
		int val;
		String sval = con.readLine();
		val = Integer.parseInt(sval);
		int location = Arrays.binarySearch(mark,val);
		con.printf("%nThe location of the value %d is %d%n",val,location);
		
	}
}