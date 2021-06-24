package controller;

import model.Avvocato;
import model.Dirigente;
import model.Persona;
import view.Vista;


public class Avvio {

	public static void main(String[] args) {
	
		Vista v=new Vista();
		Persona p=null;
		
		int scelta=3;
		switch(scelta) {
		case 1:
			p=new Persona();
			v.inserimento(p);
			break;
			case 2:
			p=new Avvocato();
			v.inserimento(p);
			break;
			case 3:
			p=new Dirigente();
			v.inserimento(p);
			break;
		}
	System.out.println(p);
	//upCasting
	Persona persona=new Dirigente();
	//downCasting
	Dirigente dir=(Dirigente) new Persona();
	dir.setStipendio(1000);
	dir.getStipendio();
	}
	/*
	 * Polimorfismo 
	 * metodi: overload - override
	 * oggetti: per ereditarietà - per interfaccia
	 * 
	 * Due oggetti sono simili se si ereditano oppure se implementano la stessa interfaccia 
	 * 
	 * UpCasting 
	 * converte un riferimento di tipo più specifico in un tipo più generico 
	 * 
	 * DownCasting 
	 * converte un riferimento di tipo più generico in un tipo più specifico
	 * 
	 * Avvio{
	 *  Persona p=new Persona();
	 *  Dipendente d=new Dipendente();
	 *  
	 *  stampa(p); -- stampa(d)
	 * }
	 * stampa(Persona p){ Upcasting
	 * if (p instanceof Dipendente){
	 *  System.out.println(((Dipentente)p).getStipendio()); //Downcasting
	 * }
	 * }
	 * 
	 */


}
