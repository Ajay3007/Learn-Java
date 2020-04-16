/* The program sets priority for the created threads.
	An indirect wait is made for the thread by calling join() method.
	Only after the current thread terminates the other process will start.
	
*/

import java.io.Console;

class Sumthread implements Runnable{
	Console con = System.console();
	int i, sum =0;
	public void run(){
		for(i = 1; i<=5; i++){
			sum+=i;
			con.printf("Sum of numbers from 1 upto %d = %d\n",i,sum);
		}
	}
}

class FactThread implements Runnable{
	Console con = System.console();
	int i, fact = 1;
	public void run(){
		for(i = 1; i<=5; i++){
			fact*=i;
			con.printf("Factorial of %d = %d\n",i,fact);
		}
	}
}

class Threadjoin{
	public static void main(String args[]){
		Console con = System.console();
		Thread ct = Thread.currentThread();			//The main thread is accessed by this method
		con.printf("The main thread is %s%n",ct.getName());
		Sumthread st = new Sumthread();
		FactThread ft = new FactThread();
		Thread sumt = new Thread(st,"Sum Thread");
		Thread factt = new Thread(ft,"Factorial Thread");
		sumt.setPriority(Thread.NORM_PRIORITY-2);
		factt.setPriority(Thread.NORM_PRIORITY+2);
		con.printf("The priority value of %s = %d%n",sumt.getName(),sumt.getPriority());
		con.printf("The priority value of %s = %d%n",factt.getName(),factt.getPriority());
		sumt.start();
		con.printf("Thread created is : %s\n",sumt.getName());
		//sumt.join();
		
		try{
			sumt.join();
		}catch(InterruptedException e){
			;
		}
		
		factt.start();
		con.printf("Thread created is : %s\n",factt.getName());
	}
}
/*If we don't declare the InterruptedException then following error will obtain.
C:\Users\AJAY\Documents\JavaPract\Threads>javac Threadjoin.java
Threadjoin.java:46: error: unreported exception InterruptedException; must be caught or declared to be thrown
                sumt.join();
                         ^
1 error
*/
