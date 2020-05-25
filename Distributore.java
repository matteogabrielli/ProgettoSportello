import java.util.*; 
public class Distributore extends Coda {  
	
	int numeroAttesa; 
	int numeroServito;
	
	MioTimer timer = new MioTimer();
	
	public Distributore() { 
		
		numeroAttesa = 0;
		numeroServito = 0;
		
	}
	
	public synchronized int ritiraNumero() { //cliente che ritira il suo numero
		
		numeroAttesa++;
		
		notifyAll(); 
		return numeroAttesa; 
		
	}
	
	public synchronized void attendiTurno (int numero) { //cliente che aspetta che il suo numero venga chiamato
		
		while ( numero!= numeroServito ) { 
			
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		
	}
	
	public synchronized int esisteCliente() { //controlla se ci sono clienti in coda ancora da servire
		
		while (numeroAttesa == numeroServito && timer.getSecondiPassati() < 15) {
	
//		System.out.println("Lo sportello è in attesa di clienti. "); 
				
				try {
					wait();  
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}	
			
	}
		
		numeroServito++; 
		notifyAll();
		return numeroServito;	
	}

	public int getNumeroAttesa() {
		return numeroAttesa;
	}
	
	
	

	
	
}
