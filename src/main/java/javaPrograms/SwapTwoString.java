package javaPrograms;

public class SwapTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="Hello";
		String b="World";
		
		String Split= "Thanks for your time";
		
		String S[]= Split.split(" ");
		System.out.println(S[3]);
		
		
		System.out.println("Before Swapping value of a is " + a);
		System.out.println("Before Swapping value of b is " + b);
		
		a=a+b;
		
		b=a.substring(0, a.length()-b.length());
		a= a.substring(b.length());
		
		System.out.println("After Swapping value of a is " + a);
		System.out.println("After Swapping value of b is " + b);
		
		
		
		
	}

}
