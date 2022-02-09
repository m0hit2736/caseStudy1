
import java.io.*;

class Pal{


static boolean checkPalindrome(String str)
{
	
	// Calculating string length
	int len = str.length();

	
	for(int i = 0; i < len / 2; i++)
	{
		
		// Comparing i th character
		// from starting and len-i
		// th character from end
		if (str.charAt(i) !=
			str.charAt(len - i - 1))
			return false;
	}

	
	return true;
}

// Driver Code
public static void main(String[] args)
{
	
	
	String st = "112233445566778899000000998877665544332211";
	
	if (checkPalindrome(st) == true)
		System.out.print("Yes");
	else
		System.out.print("No");
}
}


