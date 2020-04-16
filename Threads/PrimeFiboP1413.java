/*

*/

import java.io.*;



class Prime25 implements Runnable{
	Console con = System.console();
	int i, j, n; 
	public void run(){
		i = 2;
		n = 1;
		while(n<=25){
			boolean b = true;
			for(j=2;j<=(Math.sqrt(i));j++){
				if(i%j==0){
					b = false;
					break;
				}
			}
			if(b == true){
				con.printf("%d ",i);
				n++;
			}
			i++;
			/*
			try{
				if(n==10){
					Thread.sleep(3000);
				}
			}catch(InterruptedException e){
				;
			}
			*/
		}
	}
}

class Fibonacci implements Runnable{
	Console con = System.console();
	long fib = 0,f1 = 1,f2 = 1,i;
	public void run(){
		con.printf("%d, %d, ",1, 1);
		for(i=3;i<=50;i++){
			fib = f1+f2;
			f1 = f2;
			f2 = fib;
			con.printf("%d, ",fib);
			/*
			try{
				if(i==20){
					Thread.sleep(1000);
				}
			}catch(InterruptedException e){
				;
			}
			*/
		}
		
	}
	
}

class PrimeFiboP1413{
	public static void main(String args[]){
		Console con = System.console();
		Thread ct = Thread.currentThread();			//The main thread is accessed by this method
		con.printf("The priority value of %s = %d%n",ct.getName(),ct.getPriority());
		Prime25 pr = new Prime25();
		Fibonacci fb = new Fibonacci();
		Thread prn = new Thread(pr,"Prime Numbers");
		Thread fbn = new Thread(fb,"Fibonacci Numbers");
		fbn.setPriority(Thread.NORM_PRIORITY+3);
		prn.setPriority(Thread.NORM_PRIORITY);
		con.printf("The priority value of %s = %d%n",prn.getName(),prn.getPriority());
		con.printf("The priority value of %s = %d%n",fbn.getName(),fbn.getPriority());
		con.printf("The called Thread is : %s%n",fbn.getName());
		
		fbn.start();
		
		try{
			fbn.join();
		}catch(InterruptedException e){
			;
		}
		con.printf("%n");
		con.printf("The called Thread is : %s%n",prn.getName());
		prn.start();
	}
}