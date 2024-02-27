package javaPrograms;

public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String s="Rabbit Dog";
	int length= s.length();
	String reverse="";
	
	for(int i=length-1; i>=0; i--) {
		
		reverse=reverse+s.charAt(i);
	}
	System.out.println(reverse);

}
}