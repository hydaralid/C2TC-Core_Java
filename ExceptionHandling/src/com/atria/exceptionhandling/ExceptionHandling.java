package com.atria.exceptionhandling;

public class ExceptionHandling {

	
	public void Demo() throws ArithmeticException{
		int a = 5/0;
		System.out.println(a);
	}
	
	public void Slave() {
		
		try {
			Demo();
		}
		catch(ArithmeticException a) {
			System.out.println("Exception---> "+ a);
		}
	}
	
	public static void main(String[] args) {
		
		ExceptionHandling obj = new ExceptionHandling();
		obj.Slave(); 
		
		
	}
}

//try{
//	int a = 5/0;
//	System.out.println(a);
//	
//	throw new Exception();
//}
//	try {
//		int arr[] = {2};
//		arr[10] = 100;
//	}
//	catch(ArrayIndexOutOfBoundsException e1) {
//		System.out.println("Array out of bounds---> " + e1.getMessage());
//	}
//}
//
//catch(Exception e) {
//	System.out.println("Exception---> " + e);
//}
//finally {
//	System.out.println("Hellooooo");
//}
