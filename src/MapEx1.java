import java.util.HashMap;
import java.util.Map;

public class MapEx1 {

	public static void main(String[] args) {
		
		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("Limba", "engleza");
		map1.put("Culoare", "Rosu");
		map1.put("Culoare", "Rosu");
		map1.replace("Limba","asdagasgas");
		
		for (String k : map1.keySet()) {
			System.out.println("Entry cu cheia: " + k + " si cu valoarea " + map1.get(k));
		}
		System.out.println();
		for (String v: map1.values()) {
			System.out.println(v);
		}
		System.out.println();
		for (Map.Entry<String, String> entry : map1.entrySet() ) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		
		
	}

}
