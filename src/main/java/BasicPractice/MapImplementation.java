package BasicPractice;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class MapImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		map.put("one", "Naveen");
		map.put("two", "Varsha");
		map.put("three", "Shyam");
		map.put("four", "Kishori");
		
		System.out.println(map);
		System.out.println("==============================================");
		
		Set set = map.entrySet();
		System.out.println(set);
		System.out.println("==============================================");
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(Map.Entry<String, String> entry: map.entrySet()) {
		System.out.println(entry.getKey()+"   "+entry.getValue());	
		}
	}

}
