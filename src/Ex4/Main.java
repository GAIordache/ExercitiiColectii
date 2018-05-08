package Ex4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<bubuMucoasa> bubulushe = new ArrayList<bubuMucoasa>();
		bubulushe.add(new bubuMucoasa(6));
		bubulushe.add(new bubuMucoasa(3));
		bubulushe.add(new bubuMucoasa(7));
		bubulushe.add(null);
		bubulushe.add(new bubuMucoasa(11));
		bubulushe.add(new bubuMucoasa(1));
		for (bubuMucoasa a : bubulushe) {
			System.out.println(a);
		}
		//Collections.sort(bubulushe);
		
		bubulushe.sort(new bubzComparator());
		for (bubuMucoasa a : bubulushe) {
			System.out.println(a);
		}
	}

}
