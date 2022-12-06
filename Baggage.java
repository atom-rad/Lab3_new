
public class Baggage {

	int quantity = 3;
	String[] type = {"suitcase", "bag", "backpack"};
	
	static boolean marked = false;
	static boolean serviced = false;
	
	public static void markIt() {
		marked = true;
	}
	
	public static void unmarkIt() {
		marked = false;
	}

	public static void service() {
		serviced = true;
	}
	

}
