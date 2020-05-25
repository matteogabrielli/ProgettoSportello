import java.util.*; //importiamo tutte le librerie java.util
public class Main {


	public static void main(String[] args) throws InterruptedException {
		
		MioTimer timer = new MioTimer();
        
		Scanner input = new Scanner(System.in); //istanza della classe scanner per gestire l'input da tastiera
		
		Distributore d = new Distributore(); //istanzio il distributore
		
		Sportello s = new Sportello(d);
		
		Thread sportello = new Thread(s);
		timer.start();
		sportello.start();	
		while(true) {
		while( timer.getSecondiPassati() <= 15 ) {
			
			Utente u = new Utente(d);
			Thread utente = new Thread(u);
			utente.start();
			try {
				utente.sleep((long) (Math.random() *5000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			
			continue;
			}
		break;
		}
		
		
		
			System.out.println("Lo sportello sta per chiudere, non si accettano nuovi clienti. ");
						
//	    	System.out.println(d.numeroAttesa);
//	    	System.out.println(d.numeroServito);
		
//			while ( d.numeroAttesa == d.numeroServito ) {
//				
//				System.out.println("Lo sportello è chiuso!");
//			return;
//				
//			}

	   }
    }

	

