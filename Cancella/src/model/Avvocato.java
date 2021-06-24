package model;

public class Avvocato extends Persona{
	
private String coloreCravatta;
private String settore;

public void setColoreCravatta(String coloreCravatta) {
	this.coloreCravatta=coloreCravatta;
}

public void setSettore(String settore) {
	this.settore=settore;
}

public Avvocato() {
	super();
}

public Avvocato(String nome,String cognome,int eta,String coloreCravatta,String settore) {
	super(nome, cognome, eta);
	this.coloreCravatta=coloreCravatta;
	this.settore=settore;
}

@Override
public String toString() {
	return super.toString()+","+coloreCravatta+","+settore;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((coloreCravatta == null) ? 0 : coloreCravatta.hashCode());
	result = prime * result + ((settore == null) ? 0 : settore.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	Avvocato other = (Avvocato) obj;
	if (coloreCravatta == null) {
		if (other.coloreCravatta != null)
			return false;
	} else if (!coloreCravatta.equals(other.coloreCravatta))
		return false;
	if (settore == null) {
		if (other.settore != null)
			return false;
	} else if (!settore.equals(other.settore))
		return false;
	return true;
}




}
