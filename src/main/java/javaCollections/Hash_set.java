package javaCollections;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashSet<String> h= new HashSet<String>();
		
		h.add("Dhee");
		h.add("B");
		h.add("C");
		
		
		Iterator<String> i = h.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
			
		}
		
		
	}
	
	
	
	

}
