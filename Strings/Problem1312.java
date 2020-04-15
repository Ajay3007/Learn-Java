/*This program illustrate the use of compareTo() method to sort the string in alphabetical order */
import java.io.*;

class P1312{
	String str,ostr;
	int fthe,lthe,size;
	char news[];
	P1312(String str){
		this.str = str;
	}
	int FirstThe(){
		fthe = str.indexOf("the");
		return fthe;
	}
	int LastThe(){
		lthe = str.lastIndexOf("the");
		return lthe;
	}
	String NewStr(){
		fthe = str.indexOf("the");
		lthe = str.lastIndexOf("the");
		size = lthe-fthe+2;
		news = new char[size];
		str.getChars(fthe+3,lthe,news,0);
		ostr = new String(news);
		return ostr;
	}
	
}



class Problem1312{
	public static void main(String args[]){
		Console con = System.console();
		con.printf("Enter the strig having 2 the words: %n");
		String s1 = con.readLine();
		P1312 pstr = new P1312(s1);
		con.printf("First the is at index = %d and second the is at index = %d%n",pstr.FirstThe(),pstr.LastThe());
		con.printf("New String is :%n%s%n",pstr.NewStr());
	}
}
