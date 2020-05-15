
public class Sportello implements Runnable {

	
	Distributore d = new Distributore(); //istanzio il distributore

	public Sportello(Distributore d) {
		
		this.d = d;
		
	}
	
	public void run() {
		
		while (true) {
			
			System.out.println("Lo sportello è ina ttesa di clienti. ");
			
			int n = d.esisteCliente();
			
			System.out.println("Lo sportello sta servendo il cliente numero "+ n);
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		
		
	}

}
