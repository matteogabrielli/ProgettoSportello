import java.util.*;
public class Coda {
	
	Vector<Utente> coda = new Vector(); //istanziamo la classe vector
	
	public Coda() {} //costruttore vuoto
	
	public void aggiungi(Utente u) {  //creiamo il metodo aggiungi passando come parametro un utente
		
		coda.addElement(u);    //aggiungiamo al vector l'utente passato come parametro 
		
	}
	
	public void togli() {  //creiamo il metodo togli 
		
		Object obj = null; //creiamo un oggetto di valore nullo 
		
			obj = coda.elementAt(0); //il valore nullo andrà a sostituire l'elemento da togliere
			coda.removeElementAt(0);//rimuoviamo l'elemento in posizione zero
					
	}
	
	public boolean vuota() { //metodo che controlla se la coda, quindi il vector, è vuota
		
		if ( coda.size() > 0 ) { //coda.size() indica la dimensione attuale del vector
			
			return false; //se la dimensione è maggiore di zero ritorna il valore false
			
		}
		else {
			
			return true; //altrimenti ritorna il valore true
			
		}
		
	}
	

}
