package javaPrograms;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "Dheeraj (*&(&(*&(*&%$%^@^##";
		
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		 
		

	}

}
