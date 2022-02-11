package caseStudy2;


abstract class Item{
	private int id;
	private String title="";
	private int numOfCopy;
	
	
	public int getNumOfCopy() {
		// TODO Auto-generated method stub
		return numOfCopy;
	}

	public void setId(int i) {
		// TODO Auto-generated method stub
		id=i;
	}

	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public void setTitle(String string) {
		// TODO Auto-generated method stub
		title=string;
	}

	public String getTitle() {
		// TODO Auto-generated method stub
		return title;
	}

	public void setNumOfCopy(int i) {
		// TODO Auto-generated method stub
		id=i;
	}
	
	public abstract void showDetails(int id,String title,int numOfCopy);
	
	
}
abstract class WrittenItem extends Item{
	private  String Writer="";
	public void setWriter(String s)
	{
		Writer=s;
	}
	public String getWriter()
	{
		return Writer;
	}
	public abstract void AuthorName(String Writer);
	public abstract void PublishedYear(int Year);
}
class Book extends WrittenItem{
	public void AuthorName(String Writer)
	{
		System.out.println("Author Name:"+Writer);
	}
	public  void showDetails(int id,String title,int numOfCopy)
	{
			System.out.println("Details about Book:");
			System.out.println("Book id:"+id);
			System.out.println("Book Title:"+title);
			System.out.println("Number of copies:"+numOfCopy);
	}
	public void PublishedYear(int Year) {
		
	}
}
	

class JournalPaper extends WrittenItem{
	public void AuthorName(String Writer)
	{
		
	}
	private int Year;
	public void setYear(int i) {
		// TODO Auto-generated method stub
		Year=i;
	}
	public int getYear()
	{
		return Year;
	}
	public void PublishedYear(int Year)
	{
		System.out.println("Book Published Year"+Year);
	}
	
	public  void showDetails(int id,String title,int numOfCopy)
	{
	
	}
}

abstract class MediaItem extends Item{
	private int runtime;
	public void setRunTime(int i) {
		// TODO Auto-generated method stub
		runtime=i;
	}
	public int getRunTime()
	{
		return runtime;
	}
	public void runtime(int runtime)
	{
		System.out.println("Runtime of Video:"+runtime);
	}
	public abstract void artistNAme(String artist2, String genre2) ;
	public abstract void DetailsVideo(String director2, String genre2, int yearR2);
}
 class Video extends MediaItem {
	private String Director="";
	private String genre="" ;
	private int YearR;
	public void artistNAme(String artist2, String genre2) {
		
	}
	public String getDirector() {
		// TODO Auto-generated method stub
		return Director;
	}

	public void setDirector(String s) {
		// TODO Auto-generated method stub
		Director=s;
	}

	public String getGenre() {
		// TODO Auto-generated method stub
		return genre;
	}

	public void setGenre(String s) {
		// TODO Auto-generated method stub
		genre=s;
	}

	public int getYearR() {
		// TODO Auto-generated method stub
		return YearR;
	}

	public void setYearR(int i) {
		// TODO Auto-generated method stub
		YearR=i;
	}
	
	public  void showDetails(int id,String title,int numOfCopy)
	{
	
	}

	public void DetailsVideo(String director2, String genre2, int yearR2) {
		// TODO Auto-generated method stub
		System.out.println("Director NAme:"+director2);
		System.out.println("genre:"+genre2);
		System.out.println("Video published Year:"+yearR2);
	}
}
 class CD extends MediaItem{
	private String artist;
	private String genre="";
	
	public String getartists() {
		// TODO Auto-generated method stub
		return artist;
	}

	public void setartists(String s) {
		// TODO Auto-generated method stub
		artist=s;
	}
	public String getGenre() {
		// TODO Auto-generated method stub
		return genre;
	}

	public void setGenre(String s) {
		// TODO Auto-generated method stub
		genre=s;
	}
	public  void showDetails(int id,String title,int numOfCopy)
	{
	
	}
	public void DetailsVideo(String director2, String genre2, int yearR2)
	{
		
	}

	public void artistNAme(String artist2, String genre2) {
		// TODO Auto-generated method stub
		System.out.println("Artist NAme:" +artist2);
		System.out.print("genre"+genre2);
	}
}
public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Item i =new Book();
			Video v =new Video();
			i.setId(34);
			int id=i.getId();
			i.setTitle("Harry Porter");
			String title=i.getTitle();
			i.setNumOfCopy(4);
			int numOfCopy =i.getNumOfCopy();
			WrittenItem w=new Book();
			w.setWriter("J. K. Rowling");
			String Writer=w.getWriter();
			JournalPaper j=new JournalPaper();
			j.setYear(1997);
			int Year= j.getYear();
			v.setRunTime(3);
			int runtime=v.getRunTime();
			
			v.setDirector("Chris Columbus");
			String Director=v.getDirector();
			v.setGenre("Fantasy Fiction");
			String genre=v.getGenre();
			v.setYearR(2010);
			int YearR=v.getYearR();
			
			CD c=new CD();
			c.setartists("Daniel Radcliffe");
			String artist=c.getartists();
			c.setGenre(genre);
			String genre1=c.getGenre();
			i.showDetails(id, title, numOfCopy);
			Book b=new Book();
			b.AuthorName(Writer);
			j.PublishedYear(Year);
			
			
			v.runtime(runtime);
			v.DetailsVideo(Director,genre,YearR);
			
			c.artistNAme(artist,genre);
	}
}

