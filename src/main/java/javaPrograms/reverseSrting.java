package javaPrograms;

public class reverseSrting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String s="Dheeraj";
	
	int Length= s.length();
	String rev="";
	
	for(int i= Length-1; i>=0; i-- ) {
		rev = rev+s.charAt(i);
	}
	
System.out.println(rev);
	
	}
	
}
