
public class Commandable extends GameController {
	public Commandable( String userprompt, String userchoice, String help) {
		super(userprompt, userchoice, help);
		// TODO Auto-generated constructor stub
	
	}
	//public GameController(String userprompt)
		
		public String theChoice(String userchoice ) { 
		 if(userchoice != null) { 
			 if(userchoice == "yes") { 
				 return userchoice; } 
			 
		   if (userchoice == "no"); {  
				 return userchoice; }
			 
		 
				}
		return userchoice;
		
			
		} 
		
		public String help(String help) { 
				if (help == "yes") { 
					return "Time to help"; }
				  if (help != "yes") {
					return "Enter Help Command";
						}
				return help;
		}
		
}

