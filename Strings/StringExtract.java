/*This program illustrate different methods defined in the Java String class */
import java.io.*;

class StringExtract{
	public static void main(String args[]){
		Console con = System.console();
		char test[] = new char[20];
		String s1 = "This is a Demo text";
		con.printf("String s1 = %s%n",s1);
		con.printf("charAt(10) --> char at index 10 = %c%n",s1.charAt(10));
		s1.getChars(8,14,test,0);
		String s2 = new String(test);
		int len1 = s1.length();
		con.printf("length of s1 = %d%n",len1);
		String s3 = s1.substring(0,len1);
		con.printf("Is s1.equals(s3) ? : %b%n",s1.equals(s3));
		String lows1 = s1.toLowerCase();
		String ups1 = s1.toUpperCase();
		con.printf("Lower case of s1 = %s%n",lows1);
		con.printf("Upper case of s1 = %s%n",ups1);
		//String Comaprison
		con.printf("Is s1.equalsIgnoreCase(lows1) ? %b%n",s1.equalsIgnoreCase(lows1));
		con.printf("Is s1.regionMatches(15,lows1,15,4) ? %b%n",s1.regionMatches(15,lows1,15,4));
		//con.printf("Is s1.regionMatches(boolean ignorecase,16,ups1,16,4) ? %b%n",s1.regionMatches(ignorecase,16,ups1,16,4));
		con.printf("Is s1.endsWith(ext) ? %b%n",s1.endsWith("ext"));
		con.printf("Is s1.startsWith(Thi) ? %b%n",s1.startsWith("Thi"));
		//Searching substring
		con.printf("String s2 = %s%n",s2);
		con.printf("first occurance of s1.indexOf('D') = %d%nfirst occurance of s2.indexOf('D') = %d%n",s1.indexOf('D'),s2.indexOf('D'));
		con.printf("Index of last occurance of s1.lastIndexOf('s') = %d%n",s1.lastIndexOf('s'));
		con.printf("first occurance of s1.indexOf(is) = %d%n",s1.indexOf("is"));
		con.printf("Index of last occurance of s1.lastIndexOf(is) = %d%n",s1.lastIndexOf("is"));
		//String Modification
		String concat_s1 = s1.concat(" and you will enjoy it.");
		con.printf("s1 after concatenation : %s%n",concat_s1);
		
	}
}