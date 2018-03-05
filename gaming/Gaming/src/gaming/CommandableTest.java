package gaming;



import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
//import org.mockito.Mockito;


//import gaming.Commandable;

public class CommandableTest extends Commandable { 
	
	
	@Mock 
	Commandable mock; 
	
	
	@Test
	public void testmatchCommand() {
		//Commandable mock = mock(Commandable.class);
		mock.matchCommand();
		bonk = "help";
		//System.out.println(mock);
		//when("help").thenReturn(bonk);
		//verify(bonk).equals(matchCommand("help"));
		} 
	
	
	
	
	

}
