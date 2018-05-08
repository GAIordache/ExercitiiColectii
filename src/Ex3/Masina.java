package Ex3;

public class Masina implements Comparable<Masina> {
	private int nrDeLocuri;
	
	public void setNrDeLocuri(int pNrDeLocuri) {
		this.nrDeLocuri = pNrDeLocuri;
	}
	
	public int getNrDeLocuri() {
		return this.nrDeLocuri;
	}
	
	public Masina (int pNrDeLocuri) {
		this.nrDeLocuri= pNrDeLocuri;	
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + nrDeLocuri;
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
		Masina other = (Masina) obj;
		if (nrDeLocuri != other.nrDeLocuri)
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Masina pMasina) {
		if (pMasina == null)
			return -1;
		if(nrDeLocuri < pMasina.getNrDeLocuri()) 
			return -1;
		else 
			if(nrDeLocuri == pMasina.getNrDeLocuri())
				return 0;
			else
				return 1;
		
	}
	
	@Override	
	public String toString() {
		return "Masina cu: " + nrDeLocuri + " locuri"; 
	}
	
	
}
