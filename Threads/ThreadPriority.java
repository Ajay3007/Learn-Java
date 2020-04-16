/* The program sets priority for the created threads
	
*/

import java.io.Console;

class Sumthread implements Runnable{
	Console con = System.console();
	int i, sum =0;
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

class ThreadPriority{
	public static void main(String args[]){
		Console con = System.console();
		Sumthread st = new Sumthread();
		FactThread ft = new FactThread();
		Thread sumt = new Thread(st,"Sum Thread");
		Thread factt = new Thread(ft,"Factorial Thread");
		sumt.setPriority(Thread.MIN_PRIORITY);
		factt.setPriority(Thread.MAX_PRIORITY);
		con.printf("The priority value of %s = %d%n",sumt.getName(),sumt.getPriority());
		con.printf("The priority value of %s = %d%n",factt.getName(),factt.getPriority());
		
		factt.start();
		sumt.start();
	}
}