package javaPrograms;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Occurance_Of_Specific_Character {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		String str = "asdfg asdfr hgfdsar hghasdferssssssssssss";
		int total = str.length();
		
		int aftr_removal = str.replace("s", "").length();
		
		int finalResult = total - aftr_removal;
		
		System.out.println(finalResult);
		
		
	}

}
