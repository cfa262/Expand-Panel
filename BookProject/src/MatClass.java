import java.util.Scanner;

public class MatClass
{
	private String title;
	private String author;
	private String character;
	private int numberOfPages;
	Scanner scan = new Scanner(System.in);
	public void readData( )
	{
		System.out.println("What is the title?");
		title = scan.next();
		
		System.out.println("Who is the author?");
		author = scan.next();
		
		System.out.println("Who is the main character?");
		character = scan.next();
		
		System.out.println("How many pages does it contain?");
		numberOfPages = scan.nextInt();

		
	}
	public MatClass(String title, String author, String character, int numberOfPages) 
	{
		this.title = title;
		this.author = author;
		this.character = character;
		this.numberOfPages = numberOfPages;
	}

	public String toString() {
		return "Title = " + title + 
				", Author = " + author + 
				", Main Character = " + character +
				", NumberOfPages = " + numberOfPages;
	}

}
