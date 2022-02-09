import java.util.*;
public class MinArray {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int A[]=new int[n];
		for(int i=0;i<n;i++)
		{
			A[i]=sc.nextInt();
		}
		int min=A[0];
		for(int i=1;i<n;i++)
		{
			if(A[i]<min)
			{
				min=A[i];
			}
		}
		System.out.print(min);
	}
}
