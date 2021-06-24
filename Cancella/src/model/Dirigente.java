package model;

public class Dirigente extends Avvocato {
private double stipendio;

public double getStipendio() {
	return stipendio;
}

public void setStipendio(double stipendio) {
	this.stipendio = stipendio;
}

public Dirigente() {
	super();
	
}

public Dirigente(String nome, String cognome, int eta, String coloreCravatta, String settore,double stipendio) {
	super(nome, cognome, eta, coloreCravatta, settore);
	this.stipendio=stipendio;
	
}

@Override
public String toString() {
	return super.toString() +","+stipendio ;
}


}
