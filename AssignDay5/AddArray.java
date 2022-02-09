import java.util.*;
public class AddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int A[][]=new  int[n][n];
		int B[][]=new int [n][n];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				A[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				B[i][j]=sc.nextInt();
			}
		}
		
		int Sum[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				Sum[i][j]=A[i][j]+B[i][j];
			System.out.print(Sum[i][j]);	
			}
			System.out.println();
		}
	}

}
