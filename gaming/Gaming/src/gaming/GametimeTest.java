package gaming;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.jupiter.api.Test;

class GametimeTest extends Gametime {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	String testmatchCommand; {
	
	Commandable testing123 = new Commandable();
	String tests = "input";

    InputStream in = new ByteArrayInputStream(tests.getBytes());
    System.setIn(in);

    assertEquals("help", testing123.matchCommand());
    
	}
	
}
