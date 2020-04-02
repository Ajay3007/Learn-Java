/*The given number is written in words. Ex: 237 --> two three seven*/
import java.io.Console;
class Digit2word{
	public static void main(String args[]){
		Console con = System.console();
		int x,t;
		con.printf("Enter value of x: ");
		String sx = con.readLine(),word = "",sword;
		x = Integer.parseInt(sx);
		int n = x;
		while(x>0)
		{
			t = x % 10;
			switch(t){
				case 0:
					sword = "zero";
					break;
				case 1:
					sword = "one";
					break;
				case 2:
					sword = "two";
					break;
				case 3:
					sword = "three";
					break;
				case 4:
					sword = "four";
					break;
				case 5:
					sword = "five";
					break;
				case 6:
					sword = "six";
					break;
				case 7:
					sword = "seven";
					break;
				case 8:
					sword = "eight";
					break;
				case 9:
					sword = "nine";
					break;
				default:
					sword = "No digit";
			}
			word = sword + " " + word;
			x = x / 10;
		}
		con.printf("The given number %d in words : %s%n",n,word);
	}
}