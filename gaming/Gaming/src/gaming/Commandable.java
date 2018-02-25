package gaming;

public class Commandable extends GameController {
	
	
	
	GameController boke = new GameController();
	String bonk = boke.doCommand();
	String help = bonk;
			
	public String matchCommand() { 
		
		if (bonk.equals ("HELP")) {
			return HelpCommand();
		} 
		if (bonk.equals ("QUIT")) {
			System.out.println("Have a fun time!");
			System.exit(0);
			
		} 
		if (bonk.equals ("START")) {
			System.out.println("Let's Start!");
		}
		else { 
			return null;
		}
		
		return bonk;
		
		// TODO Auto-generated method stub
		
	} 
	
	public String HelpCommand() {
		
		if (help.equals("HELP")) {
			System.out.println("Trail help? We've got you covered!" + "\n"); 
			System.out.println("To move left, press the left arrow");
			System.out.println("To move right, press the right arrow");
			System.out.println("To Have Fun, just keep playing!");
			
		}
		
		return help;
	
		
	}

	}
	

//}
