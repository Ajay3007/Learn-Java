/* The program creates two thread
	program illustrate the creation of two child threads, one find the sum of natural numbers and 
	the other finds the factorial of numbers.
	When you repeatadly run the below program, you may get the results interleaved or in a different order.
	It is due to the fact when threads are created a default priority is alloted to each of the thread.
*/

import java.io.*;

class Sumthread implements Runnable{
	Console con = System.console();
	int i, sum =1;
	public void run(){
		for(i = 1; i<=5; i++){
			sum+=i;
			con.printf("Sum of numbers from 1 upto %d = %d%n",i,sum);
		}
	}
}

class FactThread implements Runnable{
	Console con = System.console();
	int i, fact = 1;
	public void run(){
		for(i = 1; i<=5; i++){
			fact*=i;
			con.printf("Factorial of %d = %d%n",i,fact);
		}
	}
}

class TwoThread{
	public static void main(String args[]){
		Console con = System.console();
		Thread ct = Thread.currentThread();			//The main thread is accessed by this method
		con.printf("The main thread is %s%n",ct.getName());
		Sumthread st = new Sumthread();
		FactThread ft = new FactThread();
		Thread sumt = new Thread(st,"Sum Thread");
		Thread factt = new Thread(ft,"Factorial Thread");
		sumt.start();
		factt.start();
		con.printf("The thread created is : %s%n",sumt.getName());
		con.printf("The thread created is : %s%n",factt.getName());
		
	}
}