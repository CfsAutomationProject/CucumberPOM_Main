package javaCollections;

import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hash= new HashMap<Integer, String>();
		
		hash.put(1, "A");
		hash.put(2, "B");
		hash.put(3, "C");
		
		System.out.println(hash.get(2));
		
		
	}

}
