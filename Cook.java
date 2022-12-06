import java.util.Random;

public class Cook extends RestStaff{

    public Cook(String name) {
        super(name);
    }

    public void servFood(Visitor v) {
		
		String[] food = {"Steak", "Mamaliga", "Soup", "Pizza", "Borsch", "Ice cream"};
		
		Random r = new Random();
		int f = r.nextInt(food.length);
		
		System.out.println(v.type+" visitor was served by "+name+" with " + food[f]);
	}
}