/*This program calculate sum and average of two given numbers using interface*/

import java.io.Console;
import java.util.Arrays;

interface Numbers{
	int Process(int x, int y);
}

class Sum implements Numbers{
	public int Process(int a, int b){
		int sum = a + b;
		return sum;
	}
}

class Average implements Numbers{
	public int Process(int a, int b){
		int avg = (a + b)/2;
		return avg;
	}
}

class Problem915{
		public static void main(String args[]){
			Console con = System.console();
			Sum sum = new Sum();
			Average avg =  new Average();
			con.printf("Sum = %d%n",sum.Process(5,7));
			con.printf("%nAverage = %d%n",avg.Process(8,7));
		}
}