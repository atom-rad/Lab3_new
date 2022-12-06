/*import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;*/

public class Restaurant {

	RestStaff rf;
	
	public Restaurant(RestStaff rf) {
		this.rf = rf;
		
	}
	
	public void serveTheClient(Visitor v) {
		//rf.servFood(v);
		
		System.out.println("A visitor was served");
	}
	/*Timer timer1 = new Timer("Timer1");

    long delay1 = 1500L;
    timer1.schedule(task1, delay1, delay1);

    Timer eating_timer = new Timer("eating_timer");
    TimerTask eating_task = new TimerTask() {
      public void run() { .change_weather(zoo); }
    };

    long weather_delay = 10000L;
    weather_timer.schedule(weather_task, weather_delay, weather_delay);
  }*/
	
	
}
