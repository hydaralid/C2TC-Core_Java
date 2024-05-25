package com.jdbc.model;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		//try with resources
		
		
		
		try(Scanner sc = new Scanner(System.in);){
			while(true) {
			System.out.println("Enter choice: ");
			System.out.println("1. Insert");
			System.out.println("2. Select all");
			System.out.println("3. Select employee by an id");
			System.out.println("4. Delete employee");
			System.out.println("5. Update employee");
			System.out.println("6. Exit");
		
		int choice = sc.nextInt();
		sc.nextLine();
		
		switch(choice) {
		case 1: System.out.println(choice);
				break;
		case 2: System.out.println(choice);
				break;
		case 3: System.out.println(choice);
				break;
		case 4: System.out.println(choice);
				break;
		case 5: System.out.println(choice);
				break;
		case 6: System.out.println("Thanl you for using the application");
		
				break;
		default: System.out.println("Incorrect choice");
			break;
		}
		}
		}
	}

}
