package view;

import model.Avvocato;
import model.Dirigente;
import model.Persona;

public class Vista {

	public void stampaCSV(Persona p) {
		System.out.println(p.toString());
	}
	
	public void inserimento(Persona p){
		 if(p instanceof Dirigente) {
			p.setNome("pippo");
			p.setCognome("pluto");
			p.setEta(33);
			//((Dirigente)p).setColoreCravatta("verde");
			Dirigente dir=(Dirigente)p;
			dir.setColoreCravatta("giallo");
			dir.setSettore("Penale");
			dir.setStipendio(1000);
		}else if(p instanceof Avvocato) {
			Avvocato a=(Avvocato)p;
			a.setNome("Paolo");
			a.setCognome("ciccio");
			a.setEta(42);
			a.setColoreCravatta("blu");
			a.setSettore("civile");
			
		}else {
			p.setNome("Gino");
			p.setCognome("Paoli");
			p.setEta(60);
		}
	}
}
