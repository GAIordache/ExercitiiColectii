package Ex2;

import java.util.HashMap;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		HashMap<Integer, String> map1 = new HashMap<>();
		
		
		
		for (int i =0;i<20;i++) {
			map1.put(i, getRandomString());
		}
		
		for (Integer k : map1.keySet()) {
			System.out.println(map1.get(k));
		}
		
		HashMap<Integer,String> map2 = new HashMap<>(map1);
		
		for (Integer k : map1.keySet()) {
			System.out.println(map1.get(k)==map2.get(k));
		}
	}
	
	public static String getRandomString() {
		String rndString;
		Random rnd = new Random();
		int i = rnd.nextInt(10);
		if (i >4) {
			rndString = "ala";
		} else {
			rndString ="bala";
		}
		
		return rndString;
	}
	
}
