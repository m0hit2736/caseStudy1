package caseStudy1;
import java.util.*;
public class CountLettersInArray {

	
	private static char[] createArray(char[] arr, int n) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Characters in the array");
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.next().charAt(0); 
			}
			return arr;
		}
	
	private void displayArray(char[] array) {
		// TODO Auto-generated method stub
		System.out.print(array[0]+" ");
			for(int i=1;i<array.length;i++)
			{
				if(i%19==0)
				{
					
					System.out.print(array[i]);
					System.out.println();
				}
				else {
				System.out.print(array[i]+" ");
				}
			}
			System.out.println();
		}
	
	private void dispalyCounts(char[] array) {
		// TODO Auto-generated method stub
		int n=array.length;
		boolean visited[] = new boolean[array.length];
				for(int i=0;i<array.length;i++)
				{
					visited[i]=false;
				}
				System.out.println("No of occurence of each Element");
				for (int i = 0; i < n; i++) {
					 
			        // Skip this element if already processed
			        if (visited[i] == true)
			            continue;
			 
			        // Count frequency
			        int count = 1;
			        for (int j = i + 1; j < n; j++) {
			            if (array[i] == array[j]) {
			                visited[j] = true;
			                count++;
			            }
			        }
			        System.out.println(array[i] + " --> " + count);
			    }
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountLettersInArray cl=new CountLettersInArray();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of elements in arrays");
		int n=sc.nextInt();
		char arr[]=new char[n];
		
		char array[]=cl.createArray(arr,n);
		
		cl.displayArray(array);
		
		cl.dispalyCounts(array);
	}

}


