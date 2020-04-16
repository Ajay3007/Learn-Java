/*Creation of Thread by extending the Thread class. The Thread is created and started in the constructor.
	The run() method is excuted by its own class object. The run() method is not directly called.
	When the start() method is called, the run() method is automatically called. 
*/
import java.io.*;

class Sumthread extends Thread{
	Console con = System.console();
	int i, sum =1;
	Thread th;
	Sumthread(){
		th = new Thread(this, "My thread1");
		con.printf("The thread created is %s%n",th.getName());
		th.start();
	}
	public void run(){
		for(i = 1; i<=10; i++){
			sum+=i;
			con.printf("Sum of numbers from 1 upto %d = %d%n",i,sum);
		}
	}
}

class Threadcreate1{
	public static void main(String args[]){
		new Sumthread();
	}
}