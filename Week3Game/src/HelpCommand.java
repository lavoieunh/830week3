import java.util.Scanner;

public class HelpCommand {
	


	public String help;

	public HelpCommand() { 
		Scanner prompt = new Scanner(System.in);
		if (help == "yes") { 
			System.out.println("lets get help");
		} else if (help == "no") { 
			System.out.println("no help required"); 
		} 
		else { 
			System.out.println("incorrect entry");
		}
		prompt.close();
		//return help;
	
		}
		
	
	}
	
	


