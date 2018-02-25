package gaming;
import java.io.*;
import java.util.Scanner;


public class GameController implements Command {

	public String doCommand() {

		Scanner match = new Scanner(System.in);
		System.out.println("Welcome to the New Hampshire Trail! It's no Oregon, but it works");
		System.out.println("Please enter your command - it can be help, quit, start");
		String output1 = match.nextLine();
		String output = output1.toUpperCase();	
		match.close();
		
		if ( output.equals("HELP" )) { 
			System.out.println("You chose" + " " + output);
		}
		else if ( output.equals("QUIT") ) {
				System.out.println("You chose" + " " + output); }
		else if (output.equals("START")) {
				System.out.println("You chose" + " " + output); }
			
			else 
				System.out.println("Cannot be resolved - enter choice above");
			
		
		return output;
		}

	@Override
	public String matchCommand() {
		// TODO Auto-generated method stub
		return null;
	}
		
		



}
