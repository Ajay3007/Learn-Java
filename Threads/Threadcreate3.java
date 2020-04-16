/*Creation of Thread by implementing the interface Runnable. The thread is created and started by the constructor of the same class

*/

import java.io.*;

class Sumthread implements Runnable{
	Console con = System.console();
	int i, sum =1;
	Thread th;
	Sumthread(){
		th = new Thread(this, "My Thread3");
		con.printf("The created thread is : %s%n",th.getName());
		con.printf("Before starting the Thread%nIs the thread alive? : %b%n",th.isAlive());
		th.start();
		con.printf("After starting the Thread%nIs the thread alive? : %b%n",th.isAlive());
	}
	public void run(){
		for(i = 1; i<=10; i++){
			sum+=i;
			con.printf("Sum of numbers from 1 upto %d = %d%n",i,sum);
		}
	}
}

class Threadcreate3{
	public static void main(String args[]){
		new Sumthread();
	}
}