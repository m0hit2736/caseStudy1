
public class AvgArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[4];
		for(int i=0;i<4;i++)
		{
			arr[i]=i*2;
		}
		int sum=0;
		for(int i=0;i<4;i++)
		{
			sum+=(arr[i]);
		}
		System.out.print("Average:"+ sum/4);
	}

}
