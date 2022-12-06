
public class Hotel {
    String name = "Dolphin";
	String city = "New-York";
	int RestrictedNumber = 1408;
    static boolean reservation1408 = false;

    public static void Reservation1408() {
        reservation1408 = true;
        System.out.println(reservation1408);

        if(reservation1408 = true){
            CallMe();
        }
    }

    public static void CallMe() {
        
        System.out.println("Brr-rr-ing");

    }
}
