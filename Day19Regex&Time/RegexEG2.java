package Day19RegexTime;

import java.util.regex.Pattern;

public class RegexEG2 {
public static void main(String args[])
{
Pattern p= Pattern.compile("\\s");
	
	String[] s=p.split("I am mohit from ramganjamndi");
	
	for(String str:s) {
		System.out.println(str);
	}
	
	Pattern p1= Pattern.compile("\\d");
	String[] str1=p1.split("mohit34gupta");
	for(String s1: str1)
	{
		System.out.println(s1);
	}
}
}
