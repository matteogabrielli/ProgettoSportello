 /**
@author matteoGabrielli
 */
import java.util.*;
public class MioTimer extends Thread{

	int secondiPassati = 0;
	
	public MioTimer() {}
	
	Timer timer = new Timer();
	TimerTask task = new TimerTask() {
		
			public void run() {
		
		secondiPassati++;
		
		
	}
		
	};

	public void start() {
		
		timer.schedule(task,1000,1000); //il timer farà partire l'esecuziune inserita nell'oggettto task. ogni mille millisecondi
	}
	public int getSecondiPassati() {
		return secondiPassati;
	}
	
}
	 
	
