import java.util.*;
class AddNumber{
	public static void main(String args[])
	{
		int num1, num2, Sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();
        
        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();
        Sum = num1 + num2;
        System.out.println("Sum of these numbers: "+Sum);
		
	long bn1,bn2;
	int i=0, r=0;
	int sum[]=new int[20]; 
	System.out.println("Addition of two binary number");
	bn1=sc.nextLong();
	bn2=sc.nextLong();
	
	while (bn1 != 0 || bn2 != 0) 
  {
   sum[i++] = (int)((bn1 % 10 + bn2 % 10 + r) % 2);
   r = (int)((bn1 % 10 + bn2 % 10 + r) / 2);
   bn1 = bn1 / 10;
   bn2 = bn2 / 10;
  }
  if (r != 0) {
   sum[i++] = r;
  }
  --i;
  while (i >= 0) {
   System.out.print(sum[i--]);
  }
	}
}