/*This program sorts an array in descending and ascending order*/
import java.io.Console;
class Sorting{
	public static void main(String args[]){
		Console con = System.console();
		int mark[] = {35,25,76,89,76,65,4,81,63,41};
		int i,j,temp;
		//find the number of elements in the array
		int maxn = mark.length;
		//Print out the given numbers
		con.printf("The given numbers%n");
		for(i=0; i<maxn; i++){
			con.printf("%d ",mark[i]);
		}
		con.printf("%n%n");
		//Sort the given numbers in descending order
		for(i=0; i<maxn; i++){
			for(j=i+1; j<maxn; j++){
				if(mark[j] > mark[i]){
					temp = mark[i];
					mark[i] = mark[j];
					mark[j] = temp;
				}
			}
		}
		//Print the sorted array
		con.printf("The sorted numbers in descending order%n");
		for(i=0; i<maxn; i++){
			con.printf("%d ",mark[i]);
		}
		con.printf("%n%n");
		
		//Sort the given numbers in ascending order
		for(i=0; i<maxn; i++){
			for(j=i+1; j<maxn; j++){
				if(mark[j] < mark[i]){
					temp = mark[i];
					mark[i] = mark[j];
					mark[j] = temp;
				}
			}
		}
		//Print the sorted array
		con.printf("The sorted numbers in ascending order %n");
		for(i=0; i<maxn; i++){
			con.printf("%d ",mark[i]);
		}
		con.printf("%n");
	}
}