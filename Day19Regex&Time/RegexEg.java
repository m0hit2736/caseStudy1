package Day19RegexTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEg {



	public static void main(String[] args) {
		
		int count=0;
		Pattern p= Pattern.compile("abc");
		
		Matcher m=p.matcher("ababcaabcbbabc");
		
		while(m.find()) {
			count++;
			System.out.println(m.start()+ " "+m.end()+" "+m.group());
			
		}
		System.out.println("no of occurences:"+count);
		
	//Character classes

Pattern p1=Pattern.compile("[pqrs]");
	
	Matcher m1=p1.matcher("abspghfrbjgsqwedcgjop");
	System.out.println("Position of mentioned pattern" );
	while(m1.find()) {
		System.out.println(m1.start()+" "+m1.group());
	}
	
Pattern p2=Pattern.compile("[^pqrs]");
	
	Matcher m2=p2.matcher("abspghfrbjgsqwedcgjop");
	System.out.println("Position of mentioned pattern" );
	while(m2.find()) {
		System.out.println(m2.start()+" "+m2.group());
	}
	
	//predefined character classses

	Pattern p3=Pattern.compile("\\s");
	
	Matcher m3=p3.matcher("mohit gupta");
	
	while(m3.find()) {
		System.out.println(m3.start());
	}
}
}
