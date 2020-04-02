/*This program carry out matrix multiplication*/
import java.io.Console;
class MatMul{
	public static void main(String args[]){
		Console con = System.console();
		int mat1[][] = {{5,4,7},{1,7,4}};
		int mat2[][] = {{1,5,7},{2,4,6},{3,5,7}};
		int mat3[][] = new int[2][3];
		int i,j,k;
		for(i=0; i<2; i++){
			for(k=0; k<3;k++){
				mat3[i][k] = 0;
				for(j=0; j<3; j++){
					mat3[i][k] += mat1[i][j]*mat2[j][k];
				}
			}
		}
		con.printf("%nMatrix 1%n");
		for(i=0; i<2; i++){
			for(j=0; j<3;j++){
				con.printf("%d ",mat1[i][j]);
			}
			con.printf("%n");
		}
		con.printf("%nMatrix 2%n");
		for(i=0; i<3; i++){
			for(j=0; j<3;j++){
				con.printf("%d ",mat2[i][j]);
			}
			con.printf("%n");
		}
		con.printf("%nProduct Matrix%n");
		for(i=0; i<2; i++){
			for(j=0; j<3;j++){
				con.printf("%d ",mat3[i][j]);
			}
			con.printf("%n");
		}
	}
}