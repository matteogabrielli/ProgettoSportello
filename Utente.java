import java.util.*;
public class Utente extends Coda implements Runnable {  //dichiariamo la classe Utente figlia di Coda e implementiamo l'interfaccia Runnable per poter utilizzare i thread

	Distributore d = new Distributore();
	
	MioTimer timer = new MioTimer();
	
	public Utente(Distributore d) {
		
		this.d = d;
		
	}
	
	public void run() {
		
		
		
		
		
		int mioNumero = d.ritiraNumero(); //ritira il numero
		System.out.println("Il cliente "+ mioNumero +" ha preso il suo numero.");
		Utente obj = new Utente(d);
		aggiungi(obj);
		d.attendiTurno(mioNumero); //aspetta il suo turno
		togli();
		
		
		
		
		
	}
}
