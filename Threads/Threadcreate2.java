/*Creation of Thread by extending the Thread class. The Thread is created in one class and started in another class.
	It is also possible that the run() method can be excuted by some other Thread object as shown in this program.
*/
import java.io.*;

class Sumthread extends Thread{
	Console con = System.console();
	int i, sum =1;
	public void run(){
		for(i = 1; i<=10; i++){
			sum+=i;
			con.printf("Sum of numbers from 1 upto %d = %d%n",i,sum);
		}
	}
}

class Threadcreate2{
	public static void main(String args[]){
		Console con = System.console();
		Sumthread st = new Sumthread();
		Thread th = new Thread(st, "My thread2");
		con.printf("The thread created is %s%n",th.getName());
		th.start();
	}
}