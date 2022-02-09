import java.util.Scanner;
class Area
{
   static Scanner sc = new Scanner(System.in);
   public static void main(String args[])
   {
      System.out.print("Enter the radius: ");
      /*We are storing the entered radius in double
       * because a user can enter radius in decimals
       */
      double radius = sc.nextDouble();
      int l=sc.nextInt();
	  int b=sc.nextInt();
      //Circumference = 2*PI*radius
      double circumference= Math.PI * 2*radius;
      System.out.println( "The circumference of the circle is:"+circumference) ;
	  System.out.println("Area of rectangle"+l*b);
   }
}