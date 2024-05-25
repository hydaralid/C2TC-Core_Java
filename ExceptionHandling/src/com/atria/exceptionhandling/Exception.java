package com.atria.exceptionhandling;

public class Exception {

	public static void main(String[] args) {
		
		try {
			int a = 5/1;
			System.out.println(a);
			
			try {
				int arr[]= {2};
				arr[10]=25;
			}
			catch(ArrayIndexOutOfBoundsException e1) {
				System.out.println("Exception--> " + e1);
			}
			
		}
		catch(ArithmeticException e) {
			System.out.println("Exception--> " + e);
		}
	}

}
