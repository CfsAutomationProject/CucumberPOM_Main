package javaPrograms;

public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String s="Dheeraj";
	int Length = s.length();
	String Rev= "";
	
	for(int i=Length-1; i>=0; i--) {
		
		Rev=Rev+s.charAt(i);
		Rev.replace("i", "*");
		
	}
	System.out.println(Rev);

}
}