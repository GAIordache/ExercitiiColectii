package Ex4;

public class bubuMucoasa implements Comparable<bubuMucoasa> {
	private int mucozitate;
	
	public bubuMucoasa(int pMucozitate) {
		this.mucozitate= pMucozitate;
	}
	
	public void setMucozitate(int pMucozitate) {
		this.mucozitate= pMucozitate;
	}
	public int getMucozitate() {
		return mucozitate;
	}

	@Override
	public int compareTo(bubuMucoasa arg0) {
		if (arg0 == null) {
			return -1;
		}
		if (this.mucozitate< arg0.getMucozitate()) {
			return -1;
		} else if(this.mucozitate>arg0.getMucozitate()) {
			return 1;
		}
		
		return 0;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + mucozitate;
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
		bubuMucoasa other = (bubuMucoasa) obj;
		if (mucozitate != other.mucozitate)
			return false;
		return true;
	}

	@Override	
	public String toString() {
		return "bubu cu: " + mucozitate + " mucozitate"; 
	}
}
