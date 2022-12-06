import java.util.Random;

public class Barman extends RestStaff{

    public Barman(String name) {
        super(name);
    }
   
    public void servDrink(Visitor v) {
		
		String[] drink = {"Water", "lemon jucie", "orange juice", "green tea", "latte", "Ice coffe"};
		
		Random r = new Random();
		int d = r.nextInt(drink.length);
		
		System.out.println(v.type+" visitor was served by "+name+" with " + drink[d]);
	}
}
