package edu.atria.junit;

public class ArithmeticOperations{
	public static int getSquare(int a) {
		return a*a;
	}
	public static int findMaximum(int arr[]) {
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
}


