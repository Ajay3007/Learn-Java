/*This program finds the total score, average score and highest score of 5 cricket players for game played at 4 different places*/
import java.io.Console;
import java.util.Arrays;
class TransposeMat{
	public static void main(String args[]){
		Console con = System.console();
		con.printf("Enter num of rows and columns of Matrix:%n");
		int row,col;
		String srow,scol;
		srow = con.readLine();
		row = Integer.parseInt(srow);
		scol = con.readLine();
		col = Integer.parseInt(scol);
		int i,j;
		int mat[][] = new int[row][col];
		for(i=0;i<row;i++){
			for(j=0;j<col;j++){
				con.printf("Enter the element mat[%d,%d]: ",i,j);
				String sx = con.readLine();
				mat[i][j] = Integer.parseInt(sx);
			}
		}
		//Print the original matrix
		con.printf("Given matrix is:%n");
		for(i=0;i<row;i++){
			for(j=0;j<col;j++){
				con.printf("%3d ",mat[i][j]);
			}
			con.printf("\n");
		}
		con.printf("\n");
		//Calculate transpose of the matrix
		int Tmat[][] = new int[col][row];
		for(i=0;i<col;i++){
			for(j=0;j<row;j++){
				Tmat[i][j] = mat[j][i];
			}
		}
		con.printf("Transpose of the given matrix:%n");
		for(i=0;i<col;i++){
			for(j=0;j<row;j++){
				con.printf("%3d ",Tmat[i][j]);
			}
			con.printf("\n");
		}
	}
}