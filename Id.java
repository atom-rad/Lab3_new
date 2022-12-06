//import java.util.ArrayList;
import java.util.Random;


public class Id {

	private int upperbound = 999999999;
	int id;
	
	public Id() {
		this.id = generate();
	}
	
	private int generate() {
		Random r = new Random();
		return r.nextInt(upperbound);
	}
}
