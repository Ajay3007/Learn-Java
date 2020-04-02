/*This program finds the total score, average score and highest score of 5 cricket players for game played at 4 different places*/
import java.io.Console;
import java.util.Arrays;
class Program62{
	public static void main(String args[]){
		Console con = System.console();
		String players[] = {"Dhoni","Sachin","Kohli","Jadeja","Vijay"};
		String places[] = {"Delhi","Mumbai","kolkata","chennai"};
		int scores[][] = {{45,75,51,40,35},{130,170,45,70,90},{10,60,125,65,55},{75,55,65,40,120}};
		int row,col;
		row = scores.length;
		col = scores[0].length;
		int total[] = new int[col];
		int average[] = new int[col];
		int maxscore,maxcol=45,i,j;
		String maxplayer;
		for(i=0;i<maxcol;i++)
			con.printf("_");
		con.printf("\n");
		for(i=0;i<players.length;i++)
			con.printf("\t%6s",players[i]);
		con.printf("\n");
		for(i=0;i<maxcol;i++)
			con.printf("_");
		con.printf("\n");
		//print out scores
		for(i=0;i<row;i++){
			System.out.print(places[i]+"\t");
			for(j=0;j<col;j++){
				con.printf("%3d\t",scores[i][j]);
			}
			con.printf("\n");
		}
		//Find the total scores of each players
		for(j=0;j<col;j++){
			for(i=0;i<row;i++)
				total[j] += scores[i][j];
		}
		//Print out total scores
		for(i=0;i<maxcol;i++)
			con.printf("_");
		con.printf("\n");
		con.printf("total \t");
		for(i=0;i<col;i++)
			con.printf("%3d\t",total[i]);
		con.printf("\n");
		for(i=0;i<maxcol;i++)
			con.printf("_");
		con.printf("\n");
		//Find the average and print
		for(i=0;i<col;i++)
			average[i] = total[i]/row;
		con.printf("Avg    ");
		for(i=0;i<col;i++)
			con.printf("%3d\t",average[i]);
		con.printf("\n");
		for(i=0;i<maxcol;i++)
			con.printf("_");
		con.printf("\n");
		//find the highest scorer
		maxscore = 0;
		maxplayer = "";
		for(i=0;i<col;i++){
			if(total[i]>maxscore){
				maxscore = total[i];
				maxplayer = players[i];
			}
		}
		con.printf("Highest scorer is %6s who scored a total of %4d%n",maxplayer,maxscore);
	}
}