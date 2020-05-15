
public class Utente implements Runnable {

	Distributore d = new Distributore();
	
	public Utente(Distributore d) {
		
		this.d = d;
		
	}
	
	
	public void run() {
		
		int num = d.ritiraNumero(); //cliente che ritira il suo numero di attesa
		System.out.println("Il cliente ha ritirato il suo numero"); 
		d.attendiTurno(num);
		System.out.println("Il cliente " + Thread.currentThread().getId() + " viene servito allo sportello. ");
		
		
	}

}
