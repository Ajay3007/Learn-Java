/*This program illustrates the use of Bitwise operators*/
import java.io.Console;
class Bitwise{
	public static void main(String args[]){
		Console con = System.console();
		int a, b, c, d;
		a = 71;
		con.printf("Please note that all opearations%n are done on 32 bit length%n%n");
		con.printf(" In all the outputs, the leading zeros are blank%n%n");
		con.printf(" a = %d : %32s %n",a,Integer.toBinaryString(a));
		b = ~a;
		con.printf(" ~a = %d : %32s%n",b, Integer.toBinaryString(b));
		c = 25;
		con.printf(" a = %d : %32s%n",a, Integer.toBinaryString(a));
		con.printf(" c = %d : %32s%n",c, Integer.toBinaryString(c));
		b =  a & c;
		con.printf(" a & c = %d : %32s%n",b, Integer.toBinaryString(b));
		b = a | c;
		con.printf(" a | c = %d : %32s%n",b, Integer.toBinaryString(b));
		b = a ^ c;
		con.printf(" a^c = %d : %32s%n",b, Integer.toBinaryString(b));
		b = c << 2;
		con.printf(" c<<2 = %d : %32s%n",b, Integer.toBinaryString(b));
		b = c >> 2;
		con.printf(" c>>2 = %d : %32s%n",b, Integer.toBinaryString(b));
		b = c >>> 2;
		con.printf(" c>>>2 = %d : %32s%n",b, Integer.toBinaryString(b));
		d = -25;
		con.printf(" d = %d : %32s%n",d, Integer.toBinaryString(d));
		b = d >> 2;
		con.printf(" d>>2 = %d : %32s%n",b, Integer.toBinaryString(b));
		b = d >>> 2;
		con.printf(" d>>>2 = %d : %32s%n",b, Integer.toBinaryString(b));
	}
}