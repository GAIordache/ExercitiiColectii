package Ex4;

import java.util.Comparator;

public class bubzComparator implements Comparator<bubuMucoasa>{

	@Override
	public int compare(bubuMucoasa arg0, bubuMucoasa arg1) {
		if (arg0 == null) return -1;
		if (arg1 == null) return 1;
		if(arg0.getMucozitate()<arg1.getMucozitate()) {
			return -1;
		} else if (arg0.getMucozitate()>arg1.getMucozitate()) {
			return 1;
		}
		return 0;
	}
	

}
