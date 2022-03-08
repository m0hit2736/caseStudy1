package Day19RegexTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class DateEg {
public static void main(String[] args) {
	
	LocalDate date= LocalDate.now();
	
	System.out.println("todays date:"+date);
	
	
	LocalTime time= LocalTime.now();
	
	System.out.println("curent time :"+time);
	
	//getting day month and year f the date
	int dd=date.getDayOfMonth();
	int mm=date.getMonthValue();
	int yy=date.getYear();
	
	System.out.println(dd+ " "+mm+" "+yy);
	System.out.printf("%d/%d/%d",dd,mm,yy);
	
//getting hour,minite,secnond values
	
	int hr=time.getHour();
	int min=time.getMinute();
   int sec=time.getSecond();
	int ms=time.getNano();
	
	System.out.println(hr+" "+ min+"  "+sec +"  "+ms);
	
	LocalDateTime dt= LocalDateTime.now();
	System.out.println(dt);
	
	//passing our date value
	LocalDateTime dt1= LocalDateTime.of(1994, 07, 04, 12, 45, 25);
	System.out.println(dt1);
	
	System.out.println("after 11 months:"+dt1.plusMonths(11));
	System.out.println("before 7 mnths :"+dt1.minusMonths(7));
	
	//geting age
LocalDate bdy= LocalDate.of(2000, 03, 30);
	
	LocalDate tdy=LocalDate.now();
	
	Period p=Period.between(bdy, tdy);
	
	System.out.printf("AgE IS %d years %d months %d days ",p.getYears(),p.getMonths(),p.getDays());
System.out.println();
Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter year value");
	int n= sc.nextInt(); 
	
	Year y=Year.of(n);
	
	if(y.isLeap()) {
		System.out.printf("%d year is leap year ",n);
	}
	else {
		System.out.printf("%d year is not leap year ",n);
	}
	System.out.println();
	ZoneId zone= ZoneId.systemDefault();
	System.out.println(zone);
	
	ZoneId la=ZoneId.of("Asia/Singapore");
	ZonedDateTime dt11= ZonedDateTime.now(la);
	System.out.println(dt11);
}


}