package coreJava;

import java.util.Scanner;

public class ScannerStudy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your Full Name: ");
		String name = sc.nextLine(); 
		
		System.out.println("Please enter your profession: ");
		String profession = sc.nextLine(); 
		
		System.out.println("Please enter your address: ");
		String address = sc.nextLine(); //It picks up data only till the first space
		
		System.out.println("Please enter your house number: ");
		String house = sc.nextLine();
		
		int hNo = Integer.parseInt(house);
		
		System.out.println("First Name entered is: " + name);
		System.out.println("profession is: " + profession);
		System.out.println("Address is: " + address);
		System.out.println("House Number is: " + house);
		System.out.println("House Number in int format: " + hNo);
		
//		Whenever we need to take mixed inputs like:
//		1. Numbers and Strings both
//		2. Single words first then maybe whole sentences
//		Try to use nextLine() to pick the complete data and then parse the data
		
	}

}
