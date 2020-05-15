import java.util.*;
public class Main  {


	public static void main(String[] args) {
        
		Scanner input = new Scanner(System.in);
		
		Distributore d = new Distributore(); //istanzio il distributore
		
		Sportello s = new Sportello(d);
		Thread t = new Thread(s); //thread dello sportello
		t.start();
		
		System.out.println("Quanti clienti sono gia presenti in attesa?");
		int clienti = input.nextInt();
		for (int i = 0; i < clienti; i++) {
			
			Utente u = new Utente(d);
			Thread t1 = new Thread(u);
			t1.start();
			try {
				Thread.sleep((long)(Math.random() * 1000)); //un nuovo cliente viene servito dopo un tempo random
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			
		}
		
		
		
	}

}
