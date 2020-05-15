import java.util.*;
public class Distributore {
	
	int numeroAttesa;
	int numeroServito;
	
	public Distributore() {
		
		numeroAttesa = 0;
		numeroServito = 0;
		
	}
	
	public synchronized int ritiraNumero() { // utente che ritira il suo numero di attesa
		
		numeroAttesa++;
		notifyAll(); 
		return numeroAttesa;
		
	}
	
	public synchronized void attendiTurno (int numero) { //utente che aspetta che il suo numero venga chiamato
		
		while ( numero!= numeroServito ) {
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	public synchronized int esisteCliente() { //controlla se ci sono clienti in coda ancora da servire
		
		while (numeroAttesa == numeroServito) {
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		numeroServito++;
		notifyAll();
		return numeroServito;
		
	}

	
	
}
