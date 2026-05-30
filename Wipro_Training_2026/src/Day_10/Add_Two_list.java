package Day_10;
import java.util.*;

public class Add_Two_list {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("Raj" , "Hari" , "Keshu");
		List<String> list2 = Arrays.asList("Reema" , "Mukhila" , "pp");
		
		List<String> list3 = new ArrayList<>();
		for (String s : list1) {
			if (list3.contains(s)) {
				list3.add(s);
			}
		}
		for (String s : list2) {
			if (!list3.contains(s)) {
				list3.add(s);
			}
		}
		System.out.println("Merged List: " +list3);
	}
}
