import java.util.Scanner; 

public class Sport 
{ 
	protected String teamName;
	protected String Class;
	protected int amountOfWins; 
	protected int amountOfLosses; 
	Scanner scan = new Scanner(System.in); 

	public Sport() 
	{ 
		teamName = ""; 
		amountOfWins = 0; 
		amountOfLosses = 0; 
	} 
	public String getTeamName(String teamName) 
	{ 
		return teamName; 
	} 
	public void setAmountOfLosses(int amountOfLosses) 
	{ 
		return; 
	} 
	public void setAmountOfWins(int amountOfWins) 
	{ 
		return; 
	} 
	public void input() 
	{ 
		System.out.println("The team name?"); 
		teamName = scan.nextLine(); 
		System.out.println("How many losses out of 10 games?"); 
		amountOfLosses = scan.nextInt(); 
		System.out.println("How many wins out of 10 games?"); 
		amountOfWins = scan.nextInt();

		if(amountOfLosses>5 || amountOfWins<=5)
		{
			Class = " Low Class"; 
		}
		else if(amountOfWins>5 || amountOfLosses<=5)
		{
			Class = "High Class";
		}
	} 

	public void output() 
	{ 
		System.out.println("Team Name:      "+ teamName +
				"\n" + "Wins:           " + amountOfWins +
				"\n" + "Losses:         "+ amountOfLosses+
				"\n" + "Current Class:  " + Class);
	}
}
