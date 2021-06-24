package model;
//Entità
public class Persona {

	//attributi o variabili d'istanza
		private String nome;
		private String cognome;
		private int eta;
		//setter e getter
		
	
		public void setNome(String nome) {
			this.nome=nome;
		}
		public void setCognome(String cognome) {
			this.cognome=cognome;
		}
		public void setEta(int eta) {
			this.eta=eta;
		}
		
		public String getNome() {
			return nome;
		}
		
		public String getCognome() {
			return cognome;
		}
		public int getEta() {
			return eta;
		}
		//Costruttore senza parametri 
		public Persona() {}
		// costruttore parametrizzato
		public Persona(String nome, String cognome, int eta) {
			this.nome=nome;
			this.cognome=cognome;
			this.eta=eta;
		}
		
		
		
		@Override
		public String toString() {
			return nome+","+cognome+","+eta; //formato csv(comma separator value)
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((cognome == null) ? 0 : cognome.hashCode());
			result = prime * result + eta;
			result = prime * result + ((nome == null) ? 0 : nome.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Persona other = (Persona) obj;
			if (cognome == null) {
				if (other.cognome != null)
					return false;
			} else if (!cognome.equals(other.cognome))
				return false;
			if (eta != other.eta)
				return false;
			if (nome == null) {
				if (other.nome != null)
					return false;
			} else if (!nome.equals(other.nome))
				return false;
			return true;
		}
	
	
		
	
}
