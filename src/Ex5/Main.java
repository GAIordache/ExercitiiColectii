package Ex5;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		TreeSet<String> set1 = new TreeSet();
		TreeSet<String> set2 = new TreeSet();
	   
		set1.add("rosu");
		set1.add("galben");
		set1.add("verde");
		
		set2.add("rosu");
		set2.add("galben");
		set2.add("albastru");
		
		Iterator<String> iter = set1.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println();
		set1.retainAll(set2);
		Iterator<String> iter2 = set1.iterator();
		while(iter2.hasNext()) {
			System.out.println(iter2.next());
		}

		

	}

}
