package Ex3;

import java.util.Comparator;

public class MasinaComparator implements Comparator<Masina> {

	@Override
	public int compare(Masina arg0, Masina arg1) {
		if(arg0 == null) return -1;
		if(arg1 == null) return 1;
		
		if(arg0.getNrDeLocuri()<arg1.getNrDeLocuri()) {
			return -1;
		} else if(arg0.getNrDeLocuri() > arg1.getNrDeLocuri()) {
			return 1;
		}
		return 0;
	}

	

}
