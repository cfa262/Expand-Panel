import java.util.Scanner;


public class Course {

	protected int numCourses;
	Scanner scan = new Scanner(System.in);

	public void readCourseData()
	{
		CourseClass course = new CourseClass(null, numCourses, null, null, scan);
		
		System.out.println("How many courses are you taking?");
		numCourses = scan.nextInt();

		for (int i = 0; i<numCourses; i++ )
		{
			
			course.readData();
			System.out.println(course);

		}
	}
}
