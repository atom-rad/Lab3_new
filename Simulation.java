import java.util.Queue;
import java.util.LinkedList;


public class  Simulation {
	public static void run_simul() {
	
		Queue<Visitor> row = new LinkedList<>();
		
		Visitor v1 = new Visitor();
		Visitor v2 = new Visitor();
		Visitor v3 = new Visitor();
		Visitor v4 = new Visitor();
		
		row.add(v1);
		row.add(v2);
		row.add(v3);
		row.add(v4);
		
		BaggagePorterSt bg = new BaggagePorterSt("Alex");
		ReceptionStaff rs = new ReceptionStaff("Steve");
		CleanerStaff cs = new CleanerStaff("Jhon");
		Table table = new Table();
		Chev chev = new Chev("Boris");
		Cook cook = new Cook("Abdul");
		Barman barman = new Barman("Yurii");

		Cashier cashier = new Cashier("Lena");
		Waiter waiter = new Waiter("Maria");

		while(!row.isEmpty()) {
			Visitor v = row.remove();
			Room r = new Room();
			
			rs.assignRoom(r, v);
			cs.setCleaned(true);
			bg.moveBaggage(r, v.b);
			table.occupy(v);
			chev.setNation();
			cook.servFood(v);
			barman.servDrink(v);
			cashier.payment();
			waiter.service();

			System.out.println();
		}
		
		
		
		
	}
	
	
	
}
