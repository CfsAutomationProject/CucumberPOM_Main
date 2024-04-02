package javaPrograms;

public class StaticAndNonStatic {

	//Static 
	public static String Field;
	
	//NonStatic
	public String NonStatic;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Static members can be accessed directly wihin th class
		Field= "Dheeraj";
		
		//To access non static members we have to create a object reference of a class
		StaticAndNonStatic n = new StaticAndNonStatic();
		n.NonStatic = "dh";
		
	}

}
