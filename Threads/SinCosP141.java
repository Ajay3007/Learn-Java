/*

*/

import java.io.*;

class Trigno{
	double x;
	int i, n=5;
	long factn;
	Trigno(double x){
		this.x = x;
	}
	long Factfun(int nmax){
		long fact = 1;
		for(i=2; i<=nmax; i++){
			fact *= i;
		}
		return fact;
	}
	synchronized double Sinfun(){
		double sinx = x;
		for(int k=1; k<=n; k++){
			factn = Factfun(2*k+1);
			sinx += Math.pow(-1,k)*Math.pow(x,(2*k+1))/factn;
		}
		return sinx;
	}
	synchronized double Cosfun(){
		double cosx = 1;
		for(int k=1; k<=n; k++){
			factn = Factfun(2*k);
			cosx += Math.pow(-1,k)*Math.pow(x,(2*k))/factn;
		}
		return cosx;
	}
}

class Sine implements Runnable{
	double sinval;
	Trigno trgo;
	double Sincomp(Trigno trgo){
		this.trgo = trgo;
		Thread th = new Thread(this);
		th.start();		//call the run() method
		try{
			th.sleep(50);
		}catch(InterruptedException e){;
		}
		return sinval;
	}
	public void run(){
		sinval = trgo.Sinfun();
	}
}

class Cosine implements Runnable{
	double cosval;
	Trigno trgo;
	double Coscomp(Trigno trgo){
		this.trgo = trgo;
		Thread th = new Thread(this);
		th.start();		//call the run() method
		try{
			th.sleep(50);
		}catch(InterruptedException e){;
		}
		return cosval;
	}
	public void run(){
		cosval = trgo.Cosfun();
	}
}

class SinCosP141{
	static void Printline(int p){
		Console con = System.console();
		for(int i=0; i<p; i++){
			con.printf("_");
		}
		con.printf("%n");
	}
	public static void main(String args[]){
		Console con = System.console();
		int p = 38;
		double x, six, cox, jsx, jcx;
		Trigno trg;
		Sine sino;
		Cosine coso;
		Printline(p);
		con.printf("%5s%7s%7s%6s%7s%n","x","six","Java","cox","Java");
		Printline(p);
		for(x=0; x<1.6; ){
			trg = new Trigno(x);
			sino = new Sine();
			coso = new Cosine();
			six = sino.Sincomp(trg);
			cox = coso.Coscomp(trg);
			jsx = Math.sin(x);
			jcx = Math.cos(x);
			con.printf("%3.1f %7.4f %7.4f %7.4f %7.4f%n",x,six,jsx,cox,jcx);
			x += 0.5;
		}
		Printline(p);
	}
}