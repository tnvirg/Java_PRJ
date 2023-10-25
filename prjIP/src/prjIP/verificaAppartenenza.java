package prjIP;

import java.util.Scanner;

public class verificaAppartenenza {
		private int mat1[][] ;
		private int mat2[][];
		int conta=0;
		int i;
		int j;
		
		Scanner input = new Scanner(System.in);

		public int[][] getMat1() {
			return mat1;
		}
		public void setMat1(int[][] mat1) {
			this.mat1 = mat1;
		}
		public int[][] getMat2() {
			return mat2;
		}
		public void setMat2(int[][] mat2) {
			this.mat2 = mat2;
		}

		public verificaAppartenenza()
		{
			mat1 = new int [3][4];
			mat2 = new int [3][4];
		}
		public String verificaIp () 
		{
			for (i=0 ; i<2; i++)
			{
				for (j=0;j<4;j++)
				{
					if (i==0)
					{
						System.out.println("Inserisci il " + (j+1) + " byte del primo ip ");
						mat1[i][j] = input.nextInt();
						System.out.println("Inserisci il " + (j+1) + " byte della prima subnet mask ");
						mat2[i][j] = input.nextInt();
					}
					else 
					{
						System.out.println("Inserisci il " + (j+1) + " byte del secondo ip ");
						mat1[i][j] = input.nextInt();
						System.out.println("Inserisci il " + (j+1) + " byte della seconda subnet mask ");
						mat2[i][j] = input.nextInt();
					}
				}
			}
			  for (j=0;j<4;j++)
			    {
			        mat1[2][j]=mat1[0][j]&mat1[1][j];
			        mat2[2][j]=mat2[0][j]& mat2[1][j];
			        if (mat1[2][j]==mat2[2][j])
			        {
			            conta++;
			        }
			    }
			  if (conta==4)
			  {
				  return "indirizzi appartenenti alla stessa sottorete";
			  }
			  else return "indirizzi non appartenenti alla stessa sottorete";
		}
}

		

