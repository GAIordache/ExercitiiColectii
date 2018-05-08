package Ex1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> collection1 = new ArrayList<>();
		for (int i=0;i<50;i++) {
			collection1.add(i);
		}
		
		Iterator<Integer> iter = collection1.iterator();
		while(iter.hasNext()){
			Integer i = iter.next();
			System.out.println(i);
		}
	}

}
