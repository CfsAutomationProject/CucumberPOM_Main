package javaPrograms;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Palindrome_String {

	public static void main(String[] args) {
	
		
		String sc= "MADAM";
		int length= sc.length();
		String Rev="";
		
		for(int i=length-1;i>=0; i--) {
			
			Rev=Rev+sc.charAt(i);
			
		}
	if(Rev.equals(sc)) {
		System.out.println("This String is Palindrome");
	}else {
		System.out.println("This String is not a Palindrome");
	}
}
	

}

