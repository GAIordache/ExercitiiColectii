package Ex3;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		LinkedList<String> list2 = new LinkedList();
		
		list1.add("portugalia");
		list2.add("portugalia");
		list1.add("Italia");
		list2.add("Italia");
		list1.add("Franta");
		list2.add("Franta");
		list1.add("Anglia");
		list2.add("Anglia");
		list1.add("Andora");
		list2.add("Andora");
		
		for (String s : list1) {
			System.out.println(s);
		}
		Collections.shuffle(list1);
		for (String s : list1) {
			System.out.println(s);
		}
		System.out.println("");
		Collections.sort(list1);
		for (String s : list1) {
			System.out.println(s);
		}
		
		System.out.println();
		ArrayList<Masina> list3 = new ArrayList<>();
		for (int i=0;i<7;i++) {
			list3.add(new Masina(new Random().nextInt(10)));
		}
		for(Masina m : list3) {
			System.out.println(m);
		}
		System.out.println();
		//Collections.sort(list3);
		//for(Masina m : list3) {
		//	System.out.println(m);
		//}
		
		//System.out.println();
		//Collections.shuffle(list3);
		Collections.sort(list3,new MasinaComparator());
		for(Masina m : list3) {
			System.out.println(m);
		}
	}

}
