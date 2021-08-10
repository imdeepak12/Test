import java.util.*;
public class HashMapFrequencyDemo {

	static void characterCount(String inputstring) {
		
		// Creating a HashMap containing char
        // as a key and occurrences as  a value
		HashMap<Character, Integer> map = new HashMap<>();
		
		//converting giving String to charArray
		char[] charArray = inputstring.toCharArray();
		
		//checking each character of charArray
		for(char c : charArray) {
			if(map.containsKey(c)) {
			//If given character is already present in map
			//increment its count by 1
				map.put(c, map.get(c)+1);
			}
			else {
				
			//If char if not in map put it in may with 1 as it's value
				map.put(c, 1);
			}
			}
		
		//Printing the map
		for(Map.Entry<Character, Integer> map1 : map.entrySet()) {
			System.out.println(map1.getKey()+"-"+map1.getValue());
		}
	}
	
	public static void main(String[] args) {

		String str = "programmers";
				characterCount(str);
}
}