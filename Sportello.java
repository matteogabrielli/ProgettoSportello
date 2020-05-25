
public class Sportello extends Coda implements Runnable { //dichiariamo la classe Sportello figlia di Coda e implementiamo l'interfaccia Runnable per poter utilizzare i thread

	
	Distributore d = new Distributore(); //istanzio il distributore
	
	MioTimer timer = new MioTimer();
	
	public Sportello(Distributore d) { //costruttore pieno passando come parametro il distributore
		
		this.d = d;
		
		
	}
	
	public void run() { 
		
		timer.start();
		
		while (true){
		
		while (d.getNumeroAttesa() == d.numeroServito && timer.getSecondiPassati() <15) { 
			
			System.out.println("Lo sportello è in attesa di clienti. ");
			break;
			
			}
			int n = d.esisteCliente(); 
		
			try {
				Thread.sleep(50); 
			} catch (InterruptedException e1) {
				
				e1.printStackTrace();
			}
			System.out.println("Lo sportello sta servendo il cliente numero: "+ n); 
			
			
			
			try {   
				Thread.sleep((long)(Math.random() * 10000)); //tempo random impiegato dallo sportello per servire un cliente
			} catch (InterruptedException e) { 
			 
				e.printStackTrace();  
			}
					
			if (d.getNumeroAttesa() == d.numeroServito && timer.getSecondiPassati() >15) {
				
				System.out.println("Lo sportello è chiuso!");
				return;
			} else {}
			
		}
		
		

		
		
	}
	

}
