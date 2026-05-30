package Day_10;

import java.util.*;

public class Q4_TreeMap {
	public static void main(String[] args) {
		
		TreeMap<Integer, String> patients = new TreeMap<>();
		patients.put(123, "Akansha");
        patients.put(234, "Sagarika");
        patients.put(301, "Bhakti");
        patients.put(434, "Vasudha");
        patients.put(105, "Mukhila");
        
        System.out.println(patients);
        
        patients.put(105, "Mukhila Rai");
        
        System.out.println(patients.get(105));
        System.out.println(patients.get(434));
        
        System.out.println(patients.containsKey(108));
		System.out.println(patients.containsValue("Akansha"));
		 
        patients.remove(301);
        
        System.out.println(patients.size());
        
        patients.clear();
	}
}