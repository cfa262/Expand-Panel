import java.util.Scanner;

public class ElectClass {
	protected String title;
	protected int weight;
	protected double cost;
	protected String manufacture;
	protected int power;
	Scanner scan = new Scanner (System.in);

	public void readData()
	{
		System.out.println("What's the devise?");
		title = scan.next();
		
		System.out.println("What's the weight of the devise in pounds?");
		weight = scan.nextInt();
		
		System.out.println("What's the cost?");
		cost = scan.nextDouble();
		
		System.out.println("What's its power usage in Watts?");
		power = scan.nextInt();
		
		System.out.println("Who's its manufacture?");
		manufacture = scan.next();
		
	}

	public ElectClass(String title, int weight, double cost,
			String manufacture, int power) {
		super();
		this.title = title;
		this.weight = weight;
		this.cost = cost;
		this.manufacture = manufacture;
		this.power = power;
	}

	public String toString() {
		return "Title= " + title + 
				", Weight in lbs= " + weight + 
				", Cost= $"+ cost + 
				", Manufacture= " + manufacture + 
				", Power in watts= " + power;
	}
	
}
