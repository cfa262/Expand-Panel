import java.util.Scanner;


public class CourseClass {
	protected String title;
	protected int number;
	protected String description;
	protected String department;
	Scanner scan = new Scanner(System.in);


	public void readData()
	{
		System.out.println("What is the title of the course?");
		title = scan.next();

		System.out.println("What is the number of the course?");
		number = scan.nextInt();

		System.out.println("Description of the course?");
		description = scan.next();

		System.out.println("Which department is the course in?");
		department = scan.next();
	}


	public CourseClass(String title, int number, String description, String department,
			Scanner scan) {
		super();
		this.title = title;
		this.number = number;
		this.description = description;
		this.department = department;
	}


	public String toString() {
		return "Title: " + title + 
				", Number: " + number + 
				", Description: "+ description + 
				", Department: " + department + "\n";
	}

}

