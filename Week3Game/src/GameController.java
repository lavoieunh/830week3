
import java.util.Scanner;

public class GameController  {
	
	//public String userprompt; 
	public String userchoice; 
	public String confirm; 
	public String choice;
	public String help;
	//public String helper;
	
	public GameController() { 
		//this.userprompt = userprompt; 
		//this.userchoice = userchoice; 
		Scanner prompt = new Scanner(System.in);
		System.out.println("Would you like to proceed with the game?");
		this.userchoice = (prompt.nextLine()); 
		if (userchoice == "yes") { 
			
		System.out.println("You chose:" + " " + userchoice + ", lets continue!");  
		} 
		else if (userchoice == "no") { 
			System.out.println("See you soon!");
		}
		//prompt.close(); 
	
		System.out.println("Would you like help?");
		this.help = (prompt.nextLine()); 
		if (help == "yes") { 
			System.out.print("help is on the way!");
			
		} else if (help == "no") {
			System.out.println("good luck!");
		} 
		//else { 
		//	System.out.println("Please enter a valid choice");
		//}
		
		System.out.println("Would you like to quit?");
		this.choice = (prompt.nextLine());
		if (choice == "yes" ) { 
			System.exit(0);
		} else if (choice == "no") {
			System.out.println("Let's keep playing");
		} 
		//else { 
		//	System.out.println("Please enter a valid character");
		//}
		
		prompt.close();
		
		

	} 
	
	
	}


		
	
	
	


	
